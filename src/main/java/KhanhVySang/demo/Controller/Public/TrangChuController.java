package KhanhVySang.demo.Controller.Public;

import java.sql.Date;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import KhanhVySang.demo.Model.Form.FormDangKy;
import KhanhVySang.demo.Model.Form.FormDangNhap;
import KhanhVySang.demo.Model.ThongTinCaNhan.KhachHangModel;
import KhanhVySang.demo.Model.ThongTinCaNhan.TaiKhoanModel;
import KhanhVySang.demo.Model.ThongTinMuaHang.GioHangModel;
import KhanhVySang.demo.Model.ThongTinSanPham.DanhMucModel;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.KhachHangRepository;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.TaiKhoanRepository;
import KhanhVySang.demo.Repositories.ThongTinMuaHang.GioHangRepository;
import KhanhVySang.demo.Repositories.ThongTinSanPham.DanhMucRepository;

@Controller
@RequestMapping(path = "/view")
public class TrangChuController {
    
    @Autowired
    private DanhMucRepository danhMucRepository;
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Autowired
    private GioHangRepository gioHangRepository;

    @GetMapping(path = "/trangchu")
    public String viewTrangChu(Model model){

        List<DanhMucModel> listDM = danhMucRepository.findAll();

        model.addAttribute("danhMuc", listDM);
        return "index";
    }

    @GetMapping(path = "/login")
    public String viewLoginGet(Model model){

        return "login";
    }

    @PostMapping(path = "/login")
    public String viewLoginPost(@ModelAttribute(name = "formDangNhap") FormDangNhap formDangNhap, Model model){

        String username = formDangNhap.getTenDangNhap();
        String password = formDangNhap.getMatKhau();

        Optional<TaiKhoanModel> taiKhoan = taiKhoanRepository.findByTenDangNhap(username);
        List<DanhMucModel> listDM = danhMucRepository.findAll();

        if(taiKhoan.isEmpty()) {
            model.addAttribute("message", "Tên đăng nhập hoặc mật khẩu không đúng");
            return "login";
        }
            
        if(username.equals(taiKhoan.get().getTenDangNhap()) && password.equals(taiKhoan.get().getMatKhau())){
            model.addAttribute("danhMuc", listDM);
            return "redirect:/view/trangchu";
        } else {
            model.addAttribute("message", "Tên đăng nhập hoặc mật khẩu không đúng");
            return "login";
        }
    }

    @GetMapping(path = "/register")
    public String viewRegisterGet(Model model){

        return "register";
    }

    @PostMapping(path = "/register")
    public String viewRegisterPost(@ModelAttribute(name = "formDangKy") FormDangKy formDangKy, Model model){

        String tenDangNhap = formDangKy.getTenDangNhap();
        String matKhau = formDangKy.getMatKhau();
        String nhapLaiMatKhau = formDangKy.getNhapLaiMatKhau();
        String email = formDangKy.getEmail();
        String ho = formDangKy.getHo();
        String ten = formDangKy.getTen();
        String gioiTinh = formDangKy.getGioiTinh();
        String dienThoai = formDangKy.getDienThoai();
        Date ngaySinh = formDangKy.getNgaySinh();

        List<DanhMucModel> listDM = danhMucRepository.findAll();
        Optional<TaiKhoanModel> tkTDN = taiKhoanRepository.findByTenDangNhap(tenDangNhap);
        Optional<TaiKhoanModel> tkEmail = taiKhoanRepository.findByEmail(email);
        Optional<KhachHangModel> khSDT = khachHangRepository.findByDienThoai(dienThoai);

        if(!tkTDN.isEmpty()) {
            System.out.println(tkTDN.get().getTenDangNhap());
            model.addAttribute("message", "Tên đăng nhập này đã được sử dụng");
            return "register";
        } 
        else if(!tkEmail.isEmpty()) {
            System.out.println(tkTDN.get().getEmail());
            model.addAttribute("message", "Email này đã được sử dụng");
            return "register";
        }
        else if(!khSDT.isEmpty()) {
            model.addAttribute("message", "SĐT này đã được sử dụng");
            return "register";
        } else if(!matKhau.equals(nhapLaiMatKhau)){
            model.addAttribute("message", "Hai mật khẩu không khớp nhau");
            return "register";
        } else {

            Date date = Date.valueOf(java.time.LocalDate.now());
            TaiKhoanModel taiKhoan = new TaiKhoanModel(tenDangNhap, matKhau, email, date, 5);
            taiKhoanRepository.saveAndFlush(taiKhoan);
            
            Optional<TaiKhoanModel> addTK = taiKhoanRepository.findByTenDangNhap(tenDangNhap);
            

            KhachHangModel khachHang = new KhachHangModel(ho, ten, gioiTinh, dienThoai, ngaySinh, addTK.get().getMaTaiKhoan());
            khachHangRepository.saveAndFlush(khachHang);

            Optional<KhachHangModel> addKH = khachHangRepository.findByMaTaiKhoan(addTK.get().getMaTaiKhoan());

            List<GioHangModel> gioHang = gioHangRepository.findByMaKhachHang(addKH.get().getMaKhachHang());

            model.addAttribute("gioHang", gioHang);
            model.addAttribute("danhMuc", listDM);
            return "redirect:/view/login";
        }
    }
}
