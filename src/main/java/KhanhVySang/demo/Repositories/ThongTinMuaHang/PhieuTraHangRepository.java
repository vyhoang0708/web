package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinMuaHang.PhieuTraHangModel;

@Repository
public interface PhieuTraHangRepository extends JpaRepository<PhieuTraHangModel, Integer>{
    
}
