package KhanhVySang.demo.Model.ThongTinUuDai;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ChiTietUuDaiModel.class)
@Table(name = "tblChiTietUuDai")
public class ChiTietUuDaiModel implements Serializable{
    
    @Id
    private int maUuDai;
    @Id
    private int maKhachHang;
    @Column(name = "SoLuong", nullable = false)
    private int soLuong;

    public ChiTietUuDaiModel() {}

    public ChiTietUuDaiModel(int maUuDai, int maKhachHang, int soLuong) {
        this.maUuDai = maUuDai;
        this.maKhachHang = maKhachHang;
        this.soLuong = soLuong;
    }

    public int getMaUuDai() {
        return this.maUuDai;
    }

    public void setMaUuDai(int maUuDai) {
        this.maUuDai = maUuDai;
    }

    public int getMaKhachHang() {
        return this.maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
