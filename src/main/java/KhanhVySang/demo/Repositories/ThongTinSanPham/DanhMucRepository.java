package KhanhVySang.demo.Repositories.ThongTinSanPham;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinSanPham.DanhMucModel;

@Repository
public interface DanhMucRepository extends JpaRepository<DanhMucModel, Integer>{
    Optional<DanhMucModel> findByMaDanhMuc(int maDanhMuc);
    Optional<DanhMucModel> findByTenDanhMuc(String tenDanhMuc);
    Optional<DanhMucModel> findByTrangThai(boolean trangThai);

    // List<Product> findByProductName(String productName);
    
}
