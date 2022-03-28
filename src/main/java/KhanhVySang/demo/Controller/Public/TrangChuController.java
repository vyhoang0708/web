package KhanhVySang.demo.Controller.Public;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import KhanhVySang.demo.Model.Form.FormDangKy;
import KhanhVySang.demo.Model.Form.FormDangNhap;
import KhanhVySang.demo.Model.ThongTinCaNhan.GioHangModel;
import KhanhVySang.demo.Model.ThongTinCaNhan.KhachHangModel;
import KhanhVySang.demo.Model.ThongTinCaNhan.TaiKhoanModel;
import KhanhVySang.demo.Model.ThongTinSanPham.DanhMucModel;
import KhanhVySang.demo.Model.ThongTinSanPham.LoaiSanPhamModel;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.KhachHangRepository;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.TaiKhoanRepository;
import KhanhVySang.demo.Service.ThongTinCaNhan.GioHangService;
import KhanhVySang.demo.Service.ThongTinCaNhan.KhachHangService;
import KhanhVySang.demo.Service.ThongTinCaNhan.TaiKhoanService;
import KhanhVySang.demo.Service.ThongTinSanPham.DanhMucService;
import KhanhVySang.demo.Service.ThongTinSanPham.LoaiSanPhamService;

@Controller
@RequestMapping(path = "/view")
public class TrangChuController {
    
    @Autowired
    private TaiKhoanService taiKhoanService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private GioHangService gioHangService;
    @Autowired
    private DanhMucService danhMucService;
    @Autowired
    private LoaiSanPhamService loaiSanPhamService;
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Autowired
    private KhachHangRepository khachHangRepository;

    @GetMapping(path = "/trangchu")
    public String viewTrangChu(ModelMap model, HttpSession session){
         
        List<DanhMucModel> listDM = danhMucService.findByTrangThai(true);
        List<LoaiSanPhamModel> listLSP = loaiSanPhamService.findByTrangThai(true);
        

        session.setAttribute("danhMuc", listDM);
        session.setAttribute("loaiSanPham", listLSP);
        return "index";
    }

    @GetMapping(path = "/login")
    public String viewLoginPost(ModelMap model){

        return "login";
    }

    @PostMapping(path = "/login")
    public String viewUserTrangChu(@ModelAttribute("formDangNhap") FormDangNhap form, 
                                        ModelMap model, HttpSession session, HttpServletResponse response){

        String tenDangNhap = form.getTenDangNhap();
        String matKhau = form.getMatKhau();
        TaiKhoanModel tkLogin = taiKhoanService.findByTenDangNhap(tenDangNhap);
        try {
            if(tkLogin.getMatKhau().equals(matKhau)) {

                session.setAttribute("tenDangNhap", tenDangNhap);
                session.setAttribute("matKhau", matKhau);
    
                KhachHangModel kh = khachHangService.findByMaTaiKhoan(tkLogin.getMaTaiKhoan());
                List<GioHangModel> listGH = gioHangService.findByMaKhachHang(kh.getMaKhachHang());
                
                session.setAttribute("dangDangNhap", true);
                session.setAttribute("taiKhoan", tkLogin);
                session.setAttribute("khachHang", kh);
                session.setAttribute("gioHang", listGH);

                // if(form.getLuuMatKhau()) {
                //     Cookie cookieUser = new Cookie(tenDangNhap, tenDangNhap);                    Cookie cookie = new Cookie(tenDangNhap, tenDangNhap);
                //     Cookie cookiePass = new Cookie(matKhau, matKhau);

                //     response.addCookie(cookieUser);
                //     response.addCookie(cookiePass);
                // }

                return "redirect:/view/trangchu";
            }
        } catch (Exception e) {
            model.addAttribute("message", "Tên đăng nhập hoặc mật khẩu không đúng");
            return "login";        
        }
        return "login";
    }

    @GetMapping(path = "/logout")
    public String afterLogout(HttpSession session){

        session.setAttribute("dangDangNhap", false);
        session.removeAttribute("taiKhoan");
        session.removeAttribute("khachHang");
        session.removeAttribute("gioHang");

        return "redirect:/view/trangchu";
    }

    @GetMapping(path = "/register")
    public String viewRegisterGet(Model model){

        return "register";
    }

    @PostMapping(path = "/register")
    public ModelAndView viewRegisterPost(@ModelAttribute(name = "formDangKy") FormDangKy formDangKy, ModelMap model){

        String tenDangNhap = formDangKy.getTenDangNhap();
        String matKhau = formDangKy.getMatKhau();
        String nhapLaiMatKhau = formDangKy.getNhapLaiMatKhau();
        String email = formDangKy.getEmail();
        String ho = formDangKy.getHo();
        String ten = formDangKy.getTen();
        String gioiTinh = formDangKy.getGioiTinh();
        String dienThoai = formDangKy.getDienThoai();
        Date ngaySinh = formDangKy.getNgaySinh();

        List<DanhMucModel> listDM = danhMucService.findByTrangThai(true);
        TaiKhoanModel tkTDN = taiKhoanService.findByTenDangNhap(tenDangNhap);
        TaiKhoanModel tkEmail = taiKhoanService.findByEmail(email);
        KhachHangModel khSDT = khachHangService.findByDienThoai(dienThoai);

        if(tkTDN != null){
            model.put("message", "Tên đăng nhập này đã được sử dụng");
            return new ModelAndView("redirect:/view/register", model);
            
        } 
        else if(tkEmail != null) {
            model.put("message", "Tên đăng nhập này đã được sử dụng");
            return new ModelAndView("redirect:/view/register", model);
        }
        else if(khSDT == null) {
            model.put("message", "Tên đăng nhập này đã được sử dụng");
            return new ModelAndView("redirect:/view/register");
        } else if(!matKhau.equals(nhapLaiMatKhau)){
            model.put("message", "Tên đăng nhập này đã được sử dụng");
            return new ModelAndView("redirect:/view/register", model);
        } else {

            Date date = Date.valueOf(java.time.LocalDate.now());
            TaiKhoanModel taiKhoan = new TaiKhoanModel(tenDangNhap, matKhau, email, date, 5);
            taiKhoanRepository.saveAndFlush(taiKhoan);
            
            TaiKhoanModel addTK = taiKhoanService.findByTenDangNhap(tenDangNhap);
            

            KhachHangModel khachHang = new KhachHangModel(ho, ten, gioiTinh, dienThoai, ngaySinh, addTK.getMaTaiKhoan());
            khachHangRepository.saveAndFlush(khachHang);

            KhachHangModel addKH = khachHangService.findByMaTaiKhoan(addTK.getMaTaiKhoan());

            List<GioHangModel> gioHang = gioHangService.findByMaKhachHang(addKH.getMaKhachHang());
            
            model.put("khachHang", khachHang);
            model.put("gioHang", gioHang);
            model.put("danhMuc", listDM);
            
            return new ModelAndView("redirect:/view/login", model);
        }
    }
    
}

