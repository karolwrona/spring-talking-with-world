package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/parameterTest")
public class RequestParamController {
    @GetMapping
    public ResponseEntity get(@RequestParam("pierwsza") int liczba1,
                              @RequestParam("druga") int liczba2,
                              @RequestParam(value ="trzecia", required = false) Integer liczba3) {
        return ResponseEntity.ok(liczba1+liczba2);
    }
  //  @GetMapping
   // public ResponseEntity get(@RequestParam("liczby") int[] liczby){
      //  return ResponseEntity.ok(Arrays.stream(liczby).count());
  //  }
}
