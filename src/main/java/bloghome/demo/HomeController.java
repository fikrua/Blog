package bloghome.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String blogHOME(){
        return "BlogHome";
    }
    @RequestMapping("/javapolymorhpism")
    public String poly(){
        return "javaPolymorphism";
    }
    @RequestMapping("/compostion")
    public String compo(){
        return "Compostion";
    }
    @RequestMapping("/abstraction")
    public String abs(){
        return "Abstraction";
    }
    @RequestMapping("/inheritsnce")
    public String inh(){
        return "Inheritance";
    }
    @RequestMapping("/encapsulation")
    public String enc(){
        return "Encapsulataion";
    }
    @RequestMapping("/github")
    public String git(){
        return "Github";
    }
    @RequestMapping("/AboutThebootcamp")
    public String blogaut(){
        return "AboutThebootcamp";
    }
    @RequestMapping("/BlogAutors")
    public String author(){
        return "BlogAutors";
    }

}
