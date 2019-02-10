package pl.edu.wszib.springtalkingwithworld.configuration;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.springtalkingwithworld.configuration.model.Klient;
import pl.edu.wszib.springtalkingwithworld.configuration.model.Restauracja;

import java.util.Arrays;

@Controller
@RequestMapping("/restauracja")
public class RestauracjaController {
    Klient klient = new Klient();
    @GetMapping("/koszt")
    public ResponseEntity koszt(@RequestParam(value ="swojeImie", required = true) String imieKlienta,
                                @RequestParam(value ="imieOT", required = false) String imieOT,
                               @RequestParam(value ="imieDz", required = false) String imieDz,
                               @RequestParam(value ="imieZw", required = false) String imieZw) {
        if(imieOT!=null){
            klient.osobaTowarzyszaca = true;
        }
        if(imieDz!=null) {
            klient.dziecko = true;
        }
        if(imieZw!=null) {
            klient.zwierze = true;
        }
        klient.imie = imieKlienta;
        return ResponseEntity.ok(Restauracja.koszt(klient));
    }
}
