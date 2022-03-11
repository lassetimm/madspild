package com.example.demomad.main;

//import com.example.htmlspring.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/tips")
    public String tips(){
        return "tips";
    }

    @GetMapping("/madfacts")
    public String madfacts() {
        return "madfacts";
    }

    @ResponseBody
    @GetMapping("/echo")
    public String echo(@RequestParam String echo){
        return echo;
    }
}
