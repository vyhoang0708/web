package KhanhVySang.demo.Repositories.ThongTinUuDai;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinUuDai.UuDaiKhachHangModel;

@Repository
public interface UuDaiKhachHangRepository extends JpaRepository<UuDaiKhachHangModel, Long>{
    Optional<UuDaiKhachHangModel> findByMaUuDai(int maUuDai);
    Optional<UuDaiKhachHangModel> findByPhanTramUuDai(float phanTramUuDai);
    Optional<UuDaiKhachHangModel> findByNgayBatDau(Date ngayBatDau);
    Optional<UuDaiKhachHangModel> findByNgayKetThuc(Date ngayKetThuc);
    Optional<UuDaiKhachHangModel> findByMaNhanVien(int maNhanVien);
}
