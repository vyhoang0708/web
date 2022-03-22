package KhanhVySang.demo.Service.ThongTinSanPham;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KhanhVySang.demo.Model.ThongTinSanPham.DanhMucModel;
import KhanhVySang.demo.Repositories.ThongTinSanPham.DanhMucRepository;

@Service
public class DanhMucService {
    @Autowired
    private DanhMucRepository danhMucRepository;

    public List<DanhMucModel> getTatCaDanhMuc(){

        List<DanhMucModel> listDM = danhMucRepository.findAll();

        return listDM;   
    }

    public Optional<DanhMucModel> findMotDanhMuc(int maDanhMuc) {
        Optional<DanhMucModel> dm = danhMucRepository.findByMaDanhMuc(maDanhMuc);

        return dm;
    }
}
