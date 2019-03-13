package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springtalkingwithworld.configuration.Schronisko.PlecZwierzaka;
import pl.edu.wszib.springtalkingwithworld.configuration.Schronisko.TypZwierzaka;
import pl.edu.wszib.springtalkingwithworld.configuration.Schronisko.Zwierz;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.StreamSupport;

@Controller
public class SchroniskoController {

    private Map<Integer, Zwierz> mapaZwierza = new HashMap<>();
    @PostMapping("/oddaj")
    public ResponseEntity Oddaj(@RequestParam("imie") String imie,
                                @RequestParam("wiek") int wiek,
                                @RequestParam("typ") TypZwierzaka typ,
                                @RequestParam("plec")PlecZwierzaka plec) {
        Zwierz zwierz = new Zwierz(imie, wiek, typ, plec);
        Integer klucz;
        do {klucz = new Random().nextInt(9999);}
        while (mapaZwierza.containsKey(klucz));
        zwierz.setId(klucz);
        mapaZwierza.put(klucz, zwierz);
        return ResponseEntity.ok("ID zwierza:"+zwierz.getId());
    }

    @GetMapping("/wszystkie")
    public ResponseEntity<Map> Wszystkie() {
        return ResponseEntity.ok(mapaZwierza);
    }

    @GetMapping("/zobacz/{id}")
    public ResponseEntity<Zwierz> Zobacz(@PathVariable(required = true) int id) {
        if(mapaZwierza.containsKey(id)) return ResponseEntity.ok(mapaZwierza.get(id));
        else return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/adoptuj/{id}")
    public ResponseEntity Adoptuj(@PathVariable int id) {
        if(mapaZwierza.containsKey(id)) {
            mapaZwierza.remove(id);
            return ResponseEntity.ok("Adoptowano zwierza o id:"+id);
        } else return ResponseEntity.notFound().build();
    }
}
