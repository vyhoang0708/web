package KhanhVySang.demo.Repositories.ThongTinSanPham;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinSanPham.SanPhamModel;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPhamModel, Long>{
    Optional<SanPhamModel> findByMaSanPham(int maSanPham);
    Optional<SanPhamModel> findByTenSanPham(String tenSanPham);
    Optional<SanPhamModel> findByGia(float gia);
    Optional<SanPhamModel> findByAnhDaiDien(String anhDaiDien);
    Optional<SanPhamModel> findByAnhMoTa(String anhMoTa);
    Optional<SanPhamModel> findByMaLoaiSanPham(int maLoaiSanPham);
    Optional<SanPhamModel> findByMaUuDai(int maUuDai);

}
