package KhanhVySang.demo.Model.ThongTinMuaHang;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblTrangThaiGiaoHang")
public class TrangThaiGiaoHangModel {
    
    @Id
    private int maTrangThai;
    @Column(name = "tenTrangThai", unique = true, nullable = false, length = 50)
    private String tenTrangThai;


    public TrangThaiGiaoHangModel() {}

    public TrangThaiGiaoHangModel(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }

    public int getMaTrangThai() {
        return this.maTrangThai;
    }

    public void setMaTrangThai(int maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public String getTenTrangThai() {
        return this.tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }

}
