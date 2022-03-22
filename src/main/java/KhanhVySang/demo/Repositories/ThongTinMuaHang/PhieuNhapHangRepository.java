package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinMuaHang.PhieuNhapHangModel;

@Repository
public interface PhieuNhapHangRepository extends JpaRepository<PhieuNhapHangModel, Integer>{
    
}
