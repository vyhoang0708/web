package KhanhVySang.demo.Repositories.ThongTinCaNhan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import KhanhVySang.demo.Model.ThongTinCaNhan.ChucVuModel;

@Repository
public interface ChucVuRepository extends JpaRepository<ChucVuModel, Integer>{
    ChucVuModel findByMaChucVu(int maChucVu);
    ChucVuModel findByTenChucVu(String tenChucVu);
}
