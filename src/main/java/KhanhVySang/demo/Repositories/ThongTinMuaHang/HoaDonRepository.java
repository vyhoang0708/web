package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinMuaHang.HoaDonModel;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDonModel, Integer>{
    
}