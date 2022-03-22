package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblPhieuTraHang")
public class PhieuTraHangModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maPhieuTraHang;
    @Column(name = "ngayTraHang", nullable = false)
    private Date ngayTraHang;
    @Column(name = "maTrangThai", nullable = false)
    private int maTrangThai;
    @Column(name = "tongTien", nullable = false)
    private float tongTien;
    @Column(name = "maHoaDon", nullable = false)
    private int maHoaDon;
    @Column(name = "maNhanVien")
    private int maNhanVien;

    public PhieuTraHangModel() {
    }

    public PhieuTraHangModel(Date ngayTraHang, int maTrangThai, float tongTien, int maHoaDon, int maNhanVien) {
        this.ngayTraHang = ngayTraHang;
        this.maTrangThai = maTrangThai;
        this.tongTien = tongTien;
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
    }

    public int getMaPhieuTraHang() {
        return this.maPhieuTraHang;
    }

    public void setMaPhieuTraHang(int maPhieuTraHang) {
        this.maPhieuTraHang = maPhieuTraHang;
    }

    public Date getNgayTraHang() {
        return this.ngayTraHang;
    }

    public void setNgayTraHang(Date ngayTraHang) {
        this.ngayTraHang = ngayTraHang;
    }

    public int getTrangThai() {
        return this.maTrangThai;
    }

    public void setTrangThai(int maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public float getTongTien() {
        return this.tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaHoaDon() {
        return this.maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }


}
