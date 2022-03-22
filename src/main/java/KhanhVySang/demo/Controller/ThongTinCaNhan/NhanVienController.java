package KhanhVySang.demo.Controller.ThongTinCaNhan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KhanhVySang.demo.Model.ThongTinCaNhan.NhanVienModel;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.NhanVienRepository;


// @Controller
@RestController
@RequestMapping(path = "/ttcn")
public class NhanVienController {
    @Autowired
    private NhanVienRepository repository;

    @GetMapping("/nhanvien")
    List<NhanVienModel> getTatCaNhanVien(){
        return repository.findAll();
    }
}
