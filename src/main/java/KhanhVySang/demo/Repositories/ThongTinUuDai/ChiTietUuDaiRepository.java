package KhanhVySang.demo.Repositories.ThongTinUuDai;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinUuDai.ChiTietUuDaiModel;

@Repository
// public interface ChiTietUuDaiRepository extends JpaRepository<ChiTietUuDaiModel, 1 lop chua 2 ma>{
public interface ChiTietUuDaiRepository extends JpaRepository<ChiTietUuDaiModel, Integer>{
    Optional<ChiTietUuDaiModel> findByMaUuDai(int maUuDai);
    Optional<ChiTietUuDaiModel> findByMaKhachHang(int maKhachHang);
}
