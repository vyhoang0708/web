package KhanhVySang.demo.Repositories.ThongTinMuaHang;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinMuaHang.GioHangModel;

@Repository
public interface GioHangRepository extends JpaRepository<GioHangModel, Integer>{
    List<GioHangModel> findByMaKhachHang(int maKhachHang);
}
