package KhanhVySang.demo.Model.ThongTinCaNhan;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblNhanVien")
public class NhanVienModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maNhanVien;
    @Column(name = "ho", nullable = false, length = 30)
    private String ho;
    @Column(name = "ten", nullable = false, length = 10)
    private String ten;
    @Column(name = "gioiTinh", nullable = false, length = 10)
    private String gioiTinh;
    @Column(name = "dienThoai", unique = true, nullable = false, length = 20)
    private String dienThoai;
    @Column(name = "cccd", unique = true, nullable = false, length = 20)
    private String CCCD;
    @Column(name = "ngaySinh", nullable = false)
    private Date ngaySinh;
    @Column(name = "maTaiKhoan", unique = true, nullable = false)
    private int maTaiKhoan;
    @Column(name = "trangThai", nullable = false)
    private boolean trangThai;

    public NhanVienModel() {}


    public NhanVienModel(String ho, String ten, String gioiTinh, 
                        String dienThoai, String CCCD, Date ngaySinh, 
                        int maTaiKhoan, Boolean trangThai) {
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.CCCD = CCCD;
        this.ngaySinh = ngaySinh;
        this.maTaiKhoan = maTaiKhoan;
        this.trangThai = trangThai;
    }

    public String getHo() {
        return this.ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDienThoai() {
        return this.dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getCCCD() {
        return this.CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getMaTaiKhoan() {
        return this.maTaiKhoan;
    }

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public Boolean isTrangThai() {
        return this.trangThai;
    }

    public Boolean getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }


}
