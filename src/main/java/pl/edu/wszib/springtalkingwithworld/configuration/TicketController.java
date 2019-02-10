package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springtalkingwithworld.configuration.model.Bilet;
import pl.edu.wszib.springtalkingwithworld.configuration.model.BiletDTO;
import pl.edu.wszib.springtalkingwithworld.configuration.model.Osoba;
import pl.edu.wszib.springtalkingwithworld.configuration.model.OsobaDTO;

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
  /*
    private BiletDTO convert(Bilet bilet) {
        BiletDTO biletDTO = new BiletDTO();
        biletDTO.data = bilet.data;
        biletDTO.osoba - convert(bilet.osoba);
    }
    private OsobaDTO convert(Osoba osoba) {
        OsobaDTO osobaDTO = new OsobaDTO();
        osobaDTO.imie = osoba.imie;
        osobaDTO.wiek = osoba.wiek;
    }
    private Bilet convert(BiletDTO biletDTO) {
        Bilet bilet = new Bilet();
        bilet.data = biletDTO.data;
        bilet.osoba - convert(biletDTO.osobaDTO);
    }
    private Osoba convert(OsobaDTO osobaDTO) {
        Osoba osoba = new Osoba();
        osoba.imie = osobaDTO.imie;
        osoba.wiek = osobaDTO.wiek;
    }              */
}
