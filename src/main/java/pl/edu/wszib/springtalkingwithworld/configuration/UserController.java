package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    List<String> lista = new ArrayList<>();
    @GetMapping("/istnieje/{imie}/{nazwisko}")
    public ResponseEntity get(@PathVariable(required = true) String imie, @PathVariable(required = true) String nazwisko) {
        if(lista.contains(imie+" "+nazwisko)) {
            ResponseEntity entity = new ResponseEntity("już jest taki!!!!", HttpStatus.CONFLICT);
            return entity;
        } else {
            ResponseEntity entity = new ResponseEntity("Nie było!!!", HttpStatus.OK);
            return entity;
        }
    }
    @PostMapping("/zapisz/{imie}/{nazwisko}")
    public ResponseEntity post(@PathVariable String imie, @PathVariable String nazwisko) {
        lista.add(imie+" "+nazwisko);
        ResponseEntity entity1 = new ResponseEntity("Zapisano: "+imie+" "+nazwisko, HttpStatus.OK);
        return entity1;
    }
}

