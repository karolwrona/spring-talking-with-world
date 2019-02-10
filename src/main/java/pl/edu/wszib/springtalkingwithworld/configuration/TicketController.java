package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springtalkingwithworld.configuration.model.Bilet;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/bilety")
public class TicketController {
    private Map<String, Bilet> mapa = new HashMap<>();
    @GetMapping("/{id}")
    public ResponseEntity<Bilet> odbierz(@PathVariable String id) {
        Bilet bilet = mapa.get(id);
        return ResponseEntity.ok(bilet);
    }
    @PostMapping
    public ResponseEntity dodaj(@RequestBody Bilet bilet){
        mapa.put(bilet.id, bilet);
        return ResponseEntity.ok().build();
    }
}
