package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/calc")
public class CalcController {
    @GetMapping("/suma")
    public ResponseEntity getSum(@RequestParam("liczby") int[] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).sum());
    }
    @GetMapping("/srednia")
    public ResponseEntity getAvg(@RequestParam("liczby") int[] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).average());
    }
    @GetMapping("/iloczyn")
    public ResponseEntity getMul(@RequestParam("liczby") int[] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).reduce(1,(x,y)->x*y));
    }
    @GetMapping("/roznica")
    public ResponseEntity getDiv(@RequestParam("liczby") int[] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).reduce((x,y)->x-y));
    }
    @GetMapping("/dzielenie")
    public ResponseEntity getDif(@RequestParam("liczby") int[] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).filter(y -> y !=0).reduce((x,y)->x/y));
    }
}
