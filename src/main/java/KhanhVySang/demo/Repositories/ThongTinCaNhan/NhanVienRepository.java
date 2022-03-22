package KhanhVySang.demo.Repositories.ThongTinCaNhan;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinCaNhan.NhanVienModel;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVienModel, Integer>{
    
    NhanVienModel findByMaNhanVien(int maNhanVien);
    List<NhanVienModel> findByHo(String ho);
    List<NhanVienModel> findByTen(String ten);
    List<NhanVienModel> findByGioiTinh(String gioiTinh);
    NhanVienModel findByDienThoai(String SDT);
    NhanVienModel findByCCCD(String cccd);
    List<NhanVienModel> findByNgaySinh(Date ngaySinh);
    NhanVienModel findByMaTaiKhoan(int maTaiKhoan);
}
