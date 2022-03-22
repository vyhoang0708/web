package KhanhVySang.demo.Repositories.ThongTinUuDai;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinUuDai.UuDaiSanPhamModel;

@Repository
public interface UuDaiSanPhamRepository extends JpaRepository<UuDaiSanPhamModel, Integer>{
    Optional<UuDaiSanPhamModel> findByMaUuDai(int maUuDai);
    Optional<UuDaiSanPhamModel> findByNgayBatDau(Date ngayBatDau);
    Optional<UuDaiSanPhamModel> findByNgayKetThuc(Date ngayKetThuc);
    Optional<UuDaiSanPhamModel> findByMaNhanVien(int maNhanVien);
    Optional<UuDaiSanPhamModel> findByPhanTramUuDai(float phanTramUuDai);
}
