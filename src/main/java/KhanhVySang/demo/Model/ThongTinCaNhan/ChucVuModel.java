package KhanhVySang.demo.Model.ThongTinCaNhan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblChucVu")
public class ChucVuModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maChucVu;
    @Column(name = "tenChucVu", unique = true, length = 50, nullable = false)
    private String tenChucVu;

    public ChucVuModel() {}

    public ChucVuModel(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public int getMaChucVu() {
        return this.maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return this.tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

}
