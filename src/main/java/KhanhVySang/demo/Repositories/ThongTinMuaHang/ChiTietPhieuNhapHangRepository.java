package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinMuaHang.ChiTietPhieuNhapHangModel;

@Repository
public interface ChiTietPhieuNhapHangRepository extends JpaRepository<ChiTietPhieuNhapHangModel, Integer>{
    
}
