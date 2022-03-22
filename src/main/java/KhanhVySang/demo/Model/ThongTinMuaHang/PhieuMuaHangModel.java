package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblPhieuMuaHang")
public class PhieuMuaHangModel {
    
    @Id
    private int maPhieuMuaHang;
    @Column(name = "donGia", nullable = false)
    private float donGia;
    @Column(name = "ngayMuaHang", nullable = false)
    private Date ngayMuaHang;
    @Column(name = "diaChi", nullable = false, length = 100)
    private String diaChi;
    @Column(name = "dienThoai", unique = true, nullable = false, length = 20)
    private String dienThoai;
    @Column(name = "maNhanvien")
    private int maNhanVien;
    @Column(name = "maKhachHang")
    private int maKhachHang;
    @Column(name = "maUuDai")
    private int maUuDai;
    @Column(name = "maTrangThai", nullable = false)
    private int maTrangThai;



    public PhieuMuaHangModel() {
    }

    public PhieuMuaHangModel(float donGia, Date ngayMuaHang, String diaChi, String dienThoai, int trangThai, int maNhanVien, int maKhachHang, int maUuDai) {
        this.donGia = donGia;
        this.ngayMuaHang = ngayMuaHang;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.maTrangThai = trangThai;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maUuDai = maUuDai;
    }

    public int getMaPhieuMuaHang() {
        return this.maPhieuMuaHang;
    }

    public void setMaPhieuMuaHang(int maPhieuMuaHang) {
        this.maPhieuMuaHang = maPhieuMuaHang;
    }

    public float getDonGia() {
        return this.donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public Date getNgayMuaHang() {
        return this.ngayMuaHang;
    }

    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return this.dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getTrangThai() {
        return this.maTrangThai;
    }

    public void setTrangThai(int trangThai) {
        this.maTrangThai = trangThai;
    }

    public int getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return this.maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaUuDai() {
        return this.maUuDai;
    }

    public void setMaUuDai(int maUuDai) {
        this.maUuDai = maUuDai;
    }

}
