package KhanhVySang.demo.Controller.Public;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/view")
public class CuaHangController {
    

    @RequestMapping(path = "/cuahang")
    public String viewCuaHang(){

        return "shop";
    }
}
