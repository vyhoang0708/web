package KhanhVySang.demo.Model.ThongTinCaNhan;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblTaiKhoan")
public class TaiKhoanModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maTaiKhoan;
    @Column(name = "tenDangNhap", unique = true, nullable = false, length = 20)
    private String tenDangNhap;
    @Column(name = "matKhau", nullable = false, length = 20)
    private String matKhau;
    @Column(name = "email", unique = true, nullable = false, length = 50)
    private String email;
    @Column(name = "ngayTao", nullable = false)
    private Date ngayTao;
    @Column(name = "maChucVu", nullable = false)
    private int maChucVu;

    public TaiKhoanModel() {}

    public TaiKhoanModel(String tenDangNhap, String matKhau, String email, 
                        Date ngayTao, int maChucVu) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.ngayTao = ngayTao;
        this.maChucVu = maChucVu;
    }
    public int getMaTaiKhoan() {
        return this.maTaiKhoan;
    }

    public String getTenDangNhap() {
        return this.tenDangNhap;
    }
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgayTao() {
        return this.ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    public int getMaChucVu() {
        return this.maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
    }
}
