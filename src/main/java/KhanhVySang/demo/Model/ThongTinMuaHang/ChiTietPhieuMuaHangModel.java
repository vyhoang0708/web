package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ChiTietPhieuMuaHangModel.class)
@Table(name = "tblChiTietPhieuMuaHang")
public class ChiTietPhieuMuaHangModel implements Serializable{
    
    @Id
    private int maPhieuMuaHang;
    @Id
    private int maSanPham;
    @Column(name = "soLuong", nullable = false)
    private int soLuong;


    public ChiTietPhieuMuaHangModel() {}

    public ChiTietPhieuMuaHangModel(int maPhieuMuaHang, int maSanPham, int soLuong) {
        this.maPhieuMuaHang = maPhieuMuaHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
    }

    public int getMaPhieuMuaHang() {
        return this.maPhieuMuaHang;
    }

    public void setMaPhieuMuaHang(int maPhieuMuaHang) {
        this.maPhieuMuaHang = maPhieuMuaHang;
    }

    public int getMaSanPham() {
        return this.maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
