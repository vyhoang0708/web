package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblPhieuNhapHang")
public class PhieuNhapHangModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maPhieuNhap;
    @Column(name = "ngayNhapHang", nullable = false)
    private Date ngayNhapHang;
    @Column(name = "maNhanVien", nullable = false)
    private int maNhanVien;


    public PhieuNhapHangModel() {
    }

    public PhieuNhapHangModel(Date ngayNhapHang, int maNhanVien) {
        this.ngayNhapHang = ngayNhapHang;
        this.maNhanVien = maNhanVien;
    }

    public int getMaPhieuNhap() {
        return this.maPhieuNhap;
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public Date getNgayNhapHang() {
        return this.ngayNhapHang;
    }

    public void setNgayNhapHang(Date ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public int getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

}
