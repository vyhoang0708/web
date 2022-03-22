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
import KhanhVySang.demo.Model.ThongTinSanPham.DanhMucModel;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.KhachHangRepository;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.TaiKhoanRepository;
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
        // phaanf nay bi null chua sua
        String nhapLaiMatKhau = formDangKy.getNhapLaiMatKhau();
        String email = formDangKy.getEmail();
        String ho = formDangKy.getHo();
        String ten = formDangKy.getTen();
        String gioiTinh = formDangKy.getGioiTinh();
        String dienThoai = formDangKy.getDienThoai();
        Date ngaySinh = formDangKy.getNgaySinh();

        System.out.println(tenDangNhap);
        System.out.println(matKhau);
        System.out.println(nhapLaiMatKhau);
        System.out.println(email);
        System.out.println(ho);
        System.out.println(ten);
        System.out.println(gioiTinh);
        System.out.println(dienThoai);
        System.out.println(ngaySinh);


        List<DanhMucModel> listDM = danhMucRepository.findAll();
        Optional<TaiKhoanModel> tkTDN = taiKhoanRepository.findByTenDangNhap(tenDangNhap);
        Optional<TaiKhoanModel> tkEmail = taiKhoanRepository.findByEmail(email);
        Optional<KhachHangModel> khSDT = khachHangRepository.findByDienThoai(dienThoai);



        if(tkTDN.isEmpty()) {
            model.addAttribute("message", "Tên đăng nhập này đã tồn tại");
            return "register";
        } else if(tkEmail.isEmpty()) {

            System.out.println(tkTDN.get().getMaTaiKhoan());
            model.addAttribute("message", "Email này đã được sử dụng");
            return "register";
        } else if(khSDT.isEmpty()) {
            System.out.println(tkEmail.get().getMaTaiKhoan());
            model.addAttribute("message", "SĐT này đã được sử dụng");
            return "register";
        } else {
            if(matKhau.equals(nhapLaiMatKhau)) {
                model.addAttribute("message", "Hai mật khẩu không khớp nhau");
                return "register"; 
            }
            else {
                

                Date date = Date.valueOf(java.time.LocalDate.now());
                TaiKhoanModel taiKhoan = new TaiKhoanModel(tenDangNhap, matKhau, email, date, 5);
                KhachHangModel khachHang = new KhachHangModel(ho, ten, gioiTinh, dienThoai, ngaySinh, taiKhoan.getMaTaiKhoan());

                System.out.println("TÀI KHOẢN");
                System.out.println(taiKhoan.getMaTaiKhoan());
                System.out.println(taiKhoan.getTenDangNhap());
                System.out.println(taiKhoan.getEmail());
                System.out.println(taiKhoan.getMatKhau());
                System.out.println(taiKhoan.getNgayTao());
                System.out.println(taiKhoan.getMaChucVu());
                System.out.println("KHÁCH HÀNG");
                System.out.println(khachHang.getMaTaiKhoan());
                System.out.println(khachHang.getHo());
                System.out.println(khachHang.getTen());
                System.out.println(khachHang.getGioiTinh());
                System.out.println(khachHang.getDienThoai());
                System.out.println(khachHang.getNgaySinh());
                System.out.println(khachHang.getMaKhachHang());


                model.addAttribute("danhMuc", listDM);
                return "trangchu";
            }
        }
    }

}
