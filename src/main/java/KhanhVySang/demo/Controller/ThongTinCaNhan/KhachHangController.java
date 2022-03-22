// package KhanhVySang.demo.Controller.ThongTinCaNhan;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import KhanhVySang.demo.Model.ResponseObject;
// import KhanhVySang.demo.Model.ThongTinCaNhan.KhachHangModel;
// import KhanhVySang.demo.Model.ThongTinCaNhan.TaiKhoanModel;
// import KhanhVySang.demo.Repositories.ThongTinCaNhan.KhachHangRepository;
// import KhanhVySang.demo.Repositories.ThongTinCaNhan.TaiKhoanRepository;


// // @Controller // su dung de return file html
// @RestController // su dung de return data
// @RequestMapping(path = "/ttcn")
// public class KhachHangController {
//     @Autowired
//     private KhachHangRepository repository;
//     @Autowired
//     private TaiKhoanRepository tkRepository;

//     @GetMapping("/khachhang")
//     List<KhachHangModel> getTatCaKhachHang(){
//         return repository.findAll();
//     }

//     @GetMapping("/taikhoan")
//     ResponseEntity<ResponseObject> getTatTaiKhoan() {
//         List<TaiKhoanModel> timTaiKhoan = tkRepository.findAll();

//         return timTaiKhoan.isEmpty() ? 
//             ResponseEntity.status(HttpStatus.NOT_FOUND).body(
//                 new ResponseObject("False", "Tim Khong Thanh Cong", timTaiKhoan)):
//             ResponseEntity.status(HttpStatus.OK).body(
//                 new ResponseObject("True", "Tim Thanh Cong", timTaiKhoan));
//     }
    

    
//     @GetMapping("searchkh/{maKhachHang}")
//     ResponseEntity<ResponseObject> findByMaKhachHang(@PathVariable int maKhachHang) {
//         Optional<KhachHangModel> timKhachHang = repository.findByMaKhachHang(maKhachHang);

//         return timKhachHang.isEmpty() ? 
//             ResponseEntity.status(HttpStatus.OK).body(
//                 new ResponseObject("False", "Tim Khong Thanh Cong", timKhachHang)):
//             ResponseEntity.status(HttpStatus.OK).body(
//                 new ResponseObject("True", "Tim Thanh Cong", timKhachHang));
//     }

//     // @GetMapping("/{maTaiKhoan}")
//     // ResponseEntity<ResponseObject> findByMaTaiKhoan(@PathVariable int maTaiKhoan) {
//     //     List<KhachHangModel> timKhachHang = repository.findByMaKhachHang(maTaiKhoan);

//     //     return timKhachHang.isEmpty() ? 
//     //         ResponseEntity.status(HttpStatus.OK).body(
//     //             new ResponseObject("False", "Tim Khong Thanh Cong", timKhachHang)):
//     //         ResponseEntity.status(HttpStatus.OK).body(
//     //             new ResponseObject("True", "Tim Thanh Cong", timKhachHang));
//     // }

//     @GetMapping("/{gioiTinh}")
//     ResponseEntity<ResponseObject> findByGioiTinh(@PathVariable String gioiTinh) {
//         Optional<KhachHangModel> timKhachHang = repository.findByGioiTinh(gioiTinh);

//         return timKhachHang.isEmpty() ? 
//             ResponseEntity.status(HttpStatus.OK).body(
//                 new ResponseObject("False", "Tim Khong Thanh Cong", timKhachHang)):
//             ResponseEntity.status(HttpStatus.NOT_FOUND).body(
//                 new ResponseObject("True", "Tim Thanh Cong", timKhachHang));
//     }

// }
