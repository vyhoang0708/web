package KhanhVySang.demo.Repositories.ThongTinCaNhan;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinCaNhan.KhachHangModel;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHangModel, String>{
    
    KhachHangModel findByMaKhachHang(int maKhachHang);
    Optional<KhachHangModel> findByHo(String ho);
    Optional<KhachHangModel> findByTen(String ten);
    Optional<KhachHangModel> findByGioiTinh(String gioiTinh);
    Optional<KhachHangModel> findByDienThoai(String dienThoai);
    Optional<KhachHangModel> findByNgaySinh(Date ngaySinh);
    Optional<KhachHangModel> findByMaTaiKhoan(int maTaiKhoan);

}
