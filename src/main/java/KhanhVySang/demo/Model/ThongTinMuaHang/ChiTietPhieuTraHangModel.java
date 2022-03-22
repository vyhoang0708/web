package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ChiTietPhieuTraHangModel.class)
@Table(name = "tblChiTietPhieuTraHang")
public class ChiTietPhieuTraHangModel implements Serializable{
 
    @Id
    private int maPhieuTraHang;
    @Id
    private int maSanPham;
    @Column(name = "soLuong", nullable = false)
    private int soLuong;
    @Column(name = "lyDo", nullable = false, length = 100)
    private String lyDo;

    public ChiTietPhieuTraHangModel() {
    }

    public ChiTietPhieuTraHangModel(int maPhieuTraHang, int maSanPham, int soLuong, String lyDo) {
        this.maPhieuTraHang = maPhieuTraHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.lyDo = lyDo;
    }

    public int getMaPhieuTraHang() {
        return this.maPhieuTraHang;
    }

    public void setMaPhieuTraHang(int maPhieuTraHang) {
        this.maPhieuTraHang = maPhieuTraHang;
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

    public String getLyDo() {
        return this.lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }


}
