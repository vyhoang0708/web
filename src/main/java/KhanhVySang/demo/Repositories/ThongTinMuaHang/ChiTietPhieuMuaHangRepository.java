package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinMuaHang.ChiTietPhieuMuaHangModel;

@Repository
public interface ChiTietPhieuMuaHangRepository extends JpaRepository<ChiTietPhieuMuaHangModel, Integer>{
    
}
