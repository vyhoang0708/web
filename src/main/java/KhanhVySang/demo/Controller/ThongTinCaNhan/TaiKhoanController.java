package KhanhVySang.demo.Controller.ThongTinCaNhan;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import KhanhVySang.demo.Model.ThongTinCaNhan.TaiKhoanModel;
import KhanhVySang.demo.Model.ThongTinSanPham.DanhMucModel;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.TaiKhoanRepository;
import KhanhVySang.demo.Service.ThongTinSanPham.DanhMucService;


@Controller
// @RestController
@RequestMapping(path = "/ttcn")
public class TaiKhoanController {
    
    @Autowired
    private TaiKhoanRepository repository;
    @Autowired
    private DanhMucService danhMucService;
    //GirlService girlService = context.getBean(GirlService.class);

    @GetMapping("/trangchu")
    public String getTatCaTaiKhoan(Model model){

        List<DanhMucModel> list = danhMucService.getTatCaDanhMuc();
        //Optional<TaiKhoanModel> list = repository.findByMaChucVu(5);

        model.addAttribute("danhMuc", list);
        return "index";
    }

    @GetMapping("/cuahang")
    public String getTatCaCuaHang(Model model){

        List<TaiKhoanModel> list = repository.findAll();

        model.addAttribute("taiKhoan", list);

        return "shop";
    }

    @GetMapping("/chitietcuahang")
    public String getTatCaChiTietCuaHang(Model model){

        List<TaiKhoanModel> list = repository.findAll();

        model.addAttribute("taiKhoan", list);

        return "detail";
    }

    @GetMapping("/lienhe")
    public String getTatCaLienLac(Model model){

        List<TaiKhoanModel> list = repository.findAll();

        model.addAttribute("taiKhoan", list);

        return "contact";
    }

}
