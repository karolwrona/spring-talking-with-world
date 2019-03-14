package pl.edu.wszib.springtalkingwithworld.configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Events")
public class Events {

    @GetMapping("/{tekst}")
    public String Obrazki(@PathVariable String tekst){

        if(tekst.length()%10 == 0) throw new RuntimeException1();
        else if (tekst.length()%10 == 1) throw new RuntimeException2();
        else if (tekst.length()%10 == 2) throw new RuntimeException3();
        else if (tekst.length()%10 == 3) throw new RuntimeException4();
        else if (tekst.length()%10 == 4) throw new RuntimeException5();
        else throw new RuntimeException6();
    }
    @ExceptionHandler(RuntimeException1.class)
    public String exception(){return "bunny";}
    @ExceptionHandler(RuntimeException2.class)
    public String exception1(){return "dog";}
    @ExceptionHandler(RuntimeException3.class)
    public String exception2(){return "kot";}
    @ExceptionHandler(RuntimeException4.class)
    public String exception3(){return "skoda";}
    @ExceptionHandler(RuntimeException5.class)
    public String exception4(){return "ball";}
    @ExceptionHandler(RuntimeException6.class)
    public String exception5(){return "notFound";}
}
