package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(GioHangModel.class)
@Table(name = "tblGioHang")
public class GioHangModel implements Serializable{
    
    @Id
    private long maSanPham;
    @Id
    private String maNhanVien;
    @Column(name = "soLuong", nullable = false)
    private int soLuong;


    public GioHangModel() {}

    public GioHangModel(long maSanPham, String maNhanVien, int soLuong) {
        this.maSanPham = maSanPham;
        this.maNhanVien = maNhanVien;
        this.soLuong = soLuong;
    }

    public long getMaSanPham() {
        return this.maSanPham;
    }

    public void setMaSanPham(long maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
