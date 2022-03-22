package KhanhVySang.demo.Model.ThongTinMuaHang;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblHoaDon")
public class HoaDonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maHoaDon;
    @Column(name = "ngayGhiHoaDon", nullable = false)
    private String ngayGhiHoaDon;
    @Column(name = "maNhanVien", nullable = false)
    private int maNhanVien;
    @Column(name = "maPhieuMuaHang", nullable = false)
    private int maPhieuMuaHang;

    public HoaDonModel() {}

    public HoaDonModel(String ngayGhiHoaDon, int maNhanVien, int maPhieuMuaHang) {
        this.ngayGhiHoaDon = ngayGhiHoaDon;
        this.maNhanVien = maNhanVien;
        this.maPhieuMuaHang = maPhieuMuaHang;
    }

    public int getMaHoaDon() {
        return this.maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayGhiHoaDon() {
        return this.ngayGhiHoaDon;
    }

    public void setNgayGhiHoaDon(String ngayGhiHoaDon) {
        this.ngayGhiHoaDon = ngayGhiHoaDon;
    }

    public int getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaPhieuMuaHang() {
        return this.maPhieuMuaHang;
    }

    public void setMaPhieuMuaHang(int maPhieuMuaHang) {
        this.maPhieuMuaHang = maPhieuMuaHang;
    }


}
