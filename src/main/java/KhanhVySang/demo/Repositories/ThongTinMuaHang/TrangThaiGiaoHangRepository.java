package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinMuaHang.TrangThaiGiaoHangModel;

@Repository
public interface TrangThaiGiaoHangRepository extends JpaRepository<TrangThaiGiaoHangModel, Integer>{
    
}
