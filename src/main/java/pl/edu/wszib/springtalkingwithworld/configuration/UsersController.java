package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.springtalkingwithworld.configuration.Uzytkownicy.User;
import pl.edu.wszib.springtalkingwithworld.configuration.Uzytkownicy.UserCheck;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
public class UsersController extends HttpServlet {
   private Map<String, User> mapaUserow = new HashMap<>();
   @PostMapping("/zarejestruj")
    public ResponseEntity<String> SingUp(@RequestBody UserCheck userCheck) {
      if(mapaUserow.containsKey(userCheck.getLogin())){
         return ResponseEntity.ok("Login "+userCheck.getLogin()+" jest juz zajęty");
      } else if(userCheck.getHaslo().equals(userCheck.getHaslo1())) {
         User user = new User();
         user.setLogin(userCheck.getLogin());
         user.setHaslo(userCheck.getHaslo());
         mapaUserow.put(user.getLogin(), user);
         return ResponseEntity.ok("Dodano!");
      } else {
         return ResponseEntity.ok("Podane przez ciebie hasła, nie pasuja do siebie!!");
      }
   }

   @PostMapping("/login")
   public ResponseEntity<String> Login(@RequestBody User user, HttpServletRequest request) {
      if(mapaUserow.get(user.getLogin()).getLogin().equals(user.getLogin())&&
         mapaUserow.get(user.getLogin()).getHaslo().equals(user.getHaslo())){
         HttpSession sesja = request.getSession();
         return ResponseEntity.ok(sesja.getId());
      } else {
         ResponseEntity entity = new ResponseEntity("Podany login i hasło nie pasują do siebie", HttpStatus.UNAUTHORIZED);
         return entity;
      }
   }

   @PostMapping("/logout")
   public ResponseEntity Logout(@RequestBody String klucz, HttpServletRequest request) {
      HttpSession sesja = request.getSession();
      if(klucz.equals(sesja.getId())) {
         sesja.invalidate();
         return ResponseEntity.ok().build();
      } else {
         ResponseEntity entity = new ResponseEntity(HttpStatus.UNAUTHORIZED);
         return entity;
      }
   }
}
