package KhanhVySang.demo.Repositories.ThongTinSanPham;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinSanPham.LoaiSanPhamModel;

@Repository
public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPhamModel, Integer>{
    Optional<LoaiSanPhamModel> findByMaLoaiSanPham(int maLoaiSanPham);
    Optional<LoaiSanPhamModel> findByTenLoaiSanPham(String tenLoaiSanPham);
    Optional<LoaiSanPhamModel> findByTrangThai(boolean trangThai);
    Optional<LoaiSanPhamModel> findByMaDanhMuc(int maDanhMuc);
}
