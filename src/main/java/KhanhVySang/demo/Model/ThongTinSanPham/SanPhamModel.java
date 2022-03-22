package KhanhVySang.demo.Model.ThongTinSanPham;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblSanPham")
public class SanPhamModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maSanPham;
    @Column(name = "tenSanPham", nullable = false, unique = true, length = 50)
    private String tenSanPham;
    @Column(name = "gia", nullable = false)
    private float gia;
    @Column(name = "soLuong", nullable = false)
    private int soLuong;
    @Column(name = "moTa", length = 30)
    private String moTa;
    @Column(name = "anhDaiDien", nullable = false, length = 100)
    private String anhDaiDien;
    @Column(name = "anhMoTa", length = 300)
    private String anhMoTa;
    @Column(name = "maLoaiSanPham", nullable = false)
    private int maLoaiSanPham;
    @Column(name = "maUuDai")
    private int maUuDai;

    public SanPhamModel() {}


    public SanPhamModel(String tenSanPham, float gia, int soLuong, 
                        String moTa, String anhDaiDien, String anhMoTa, 
                        int maLoaiSanPham, int maUuDai) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.anhDaiDien = anhDaiDien;
        this.anhMoTa = anhMoTa;
        this.maLoaiSanPham = maLoaiSanPham;
        this.maUuDai = maUuDai;
    }

    public int getMaSanPham() {
        return this.maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return this.tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGia() {
        return this.gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getAnhDaiDien() {
        return this.anhDaiDien;
    }

    public void setAnhDaiDien(String anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    public String getAnhMoTa() {
        return this.anhMoTa;
    }

    public void setAnhMoTa(String anhMoTa) {
        this.anhMoTa = anhMoTa;
    }

    public int getMaLoaiSanPham() {
        return this.maLoaiSanPham;
    }

    public void setMaLoaiSanPham(int maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }



}
