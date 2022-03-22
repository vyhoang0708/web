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
    private int maSanPham;
    @Id
    private int maKhachHang;
    @Column(name = "soLuong", nullable = false)
    private int soLuong;


    public GioHangModel() {}

    public GioHangModel(int maSanPham, int maKhachHang, int soLuong) {
        this.maSanPham = maSanPham;
        this.maKhachHang = maKhachHang;
        this.soLuong = soLuong;
    }

    public long getMaSanPham() {
        return this.maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaNhanVien() {
        return this.maKhachHang;
    }

    public void setMaNhanVien(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
