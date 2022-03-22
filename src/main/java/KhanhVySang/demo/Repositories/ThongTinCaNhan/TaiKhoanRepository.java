package KhanhVySang.demo.Repositories.ThongTinCaNhan;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinCaNhan.TaiKhoanModel;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoanModel, Integer>{
    
    Optional<TaiKhoanModel> findByMaTaiKhoan(int maTaiKhoan);
    Optional<TaiKhoanModel> findByTenDangNhap(String tenDangNhap);
    Optional<TaiKhoanModel> findByEmail(String email);
    TaiKhoanModel findByMatKhau(String email);
    List<TaiKhoanModel> findByNgayTao(Date ngayTao);
    List<TaiKhoanModel> findByMaChucVu(int maChucVu);
}
