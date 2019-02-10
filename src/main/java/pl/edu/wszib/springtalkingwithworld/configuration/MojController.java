package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.activation.MimeType;

@Controller
@RequestMapping("/moj")
public class MojController {

    //localhost:8080/moj
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity get() {
        ResponseEntity responseEntity = new ResponseEntity("HelloWorld", HttpStatus.OK);
        return responseEntity;
    }
    //localhost:8080/moj/json
    @GetMapping(value = "/json", produces = "application/json")
    public ResponseEntity getJson() {
        String json ="{\n" +
                "  \"imie\" : \"Adam\" ,\n" +
                "  \"szkola\" : {\n" +
                "    \"nazwa\" : \"SP11\",\n" +
                "    \"adres\" : \"Gdziestam\"\n" +
                "  },\n" +
                "  \"oceny\" : [5,4,2,1]\n" +
                "}";
        ResponseEntity responseEntity = new ResponseEntity(json, HttpStatus.OK);
        return responseEntity;
    }

}
