package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/data")
public class PathVariableController {
    @PostMapping("/{rok123}")
    public ResponseEntity post(@PathVariable("rok123") int rok) {
        ResponseEntity entity = new ResponseEntity(rok+1, HttpStatus.OK);
        return entity;
    }
}
