// package KhanhVySang.demo.Service.ThongTinCaNhan;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.security.core.GrantedAuthority;
// // import org.springframework.security.core.authority.SimpleGrantedAuthority;
// // import org.springframework.security.core.userdetails.User;
// // import org.springframework.security.core.userdetails.UserDetails;
// // import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import KhanhVySang.demo.Model.ThongTinCaNhan.ChucVuModel;
// import KhanhVySang.demo.Model.ThongTinCaNhan.KhachHangModel;
// import KhanhVySang.demo.Model.ThongTinCaNhan.NhanVienModel;
// import KhanhVySang.demo.Model.ThongTinCaNhan.TaiKhoanModel;
// import KhanhVySang.demo.Repositories.ThongTinCaNhan.ChucVuRepository;
// import KhanhVySang.demo.Repositories.ThongTinCaNhan.KhachHangRepository;
// import KhanhVySang.demo.Repositories.ThongTinCaNhan.NhanVienRepository;
// import KhanhVySang.demo.Repositories.ThongTinCaNhan.TaiKhoanRepository;

// @Service
// public class TaiKhoanService {
    
//     @Autowired
//     private TaiKhoanRepository taiKhoanRepository;
//     // @Autowired
//     // private ChucVuRepository chucVuRepository;
//     // @Autowired
//     // private NhanVienRepository nhanVienRepository;
//     // @Autowired
//     // private KhachHangRepository khachHangRepository;

//     public List<TaiKhoanModel> getTatCaTaiKhoan(){
//         List<TaiKhoanModel> list = taiKhoanRepository.findAll();

//         return list;
//     }

//     public TaiKhoanModel findTenDangNhap(String tenDangNhap){
//         TaiKhoanModel taikhoan = taiKhoanRepository.findByTenDangNhap(tenDangNhap);
//         return taikhoan;
//     }

//     // public UserDetails loadTaiKhoanByTenDangNhap(String tenDangNhap) throws UsernameNotFoundException {
     
//     //     TaiKhoanModel taiKhoan = taiKhoanRepository.findByTenDangNhap(tenDangNhap);
        
//     //     if(taiKhoan == null) {
//     //         throw new UsernameNotFoundException("Tài khoản " + tenDangNhap + "không tìm thấy");
//     //     }

//     //     int roleCode = taiKhoan.getMaChucVu();
//     //     ChucVuModel chucvu = chucVuRepository.findByMaChucVu(roleCode);
//     //     String role = chucvu.getTenChucVu();

//     //     List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();

//     //     GrantedAuthority quyen = new SimpleGrantedAuthority(role);

//     //     grantList.add(quyen);

//     //     boolean accountNonLocked = true;
//     //     NhanVienModel nv = nhanVienRepository.findByMaTaiKhoan(taiKhoan.getMaTaiKhoan());
//     //     if(nv != null){
//     //         if(nv.getTrangThai() == false) accountNonLocked = false;
//     //     } else {
//     //         KhachHangModel kh = khachHangRepository.findByMaTaiKhoan(taiKhoan.getMaTaiKhoan());
//     //         if(kh == null) accountNonLocked = false;
//     //     }

//     //     boolean enabled = true;
//     //     boolean accountNonExpired = true;
//     //     boolean credentialsNonExpired = true;

//     //     UserDetails userDetails = (UserDetails) new User(taiKhoan.getTenDangNhap(),
//     //                                                     taiKhoan.getMatKhau(), 
//     //                                                     enabled, 
//     //                                                     accountNonExpired,
//     //                                                     credentialsNonExpired, 
//     //                                                     accountNonLocked, 
//     //                                                     grantList);
        
//     //     return userDetails;
//     // }
// }
