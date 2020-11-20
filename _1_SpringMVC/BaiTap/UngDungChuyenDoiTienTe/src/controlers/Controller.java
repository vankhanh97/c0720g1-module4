package controlers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {
    private final UngDung ungDung = new UngDung();

    @GetMapping("/")
    public String home() {
        return "home_page";
    }

    @GetMapping("/chuyenDoi")
    public String chuyenDoi(@RequestParam String USD, Model model) {

        if (USD.equals("")){
            model.addAttribute("result", "Chưa có gì !");
        } else  {
            double resultFinal = ungDung.chuyenDoi(Double.parseDouble(USD));

            model.addAttribute("result", resultFinal);
        }


        return "home_page";
    }


//    @GetMapping("/")
//    public String toiTrangChuyenDoi() {
//        return "home_page";
//    }


}
