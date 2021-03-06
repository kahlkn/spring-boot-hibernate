package spring.boot.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(@RequestParam(value="k", required = false, defaultValue = "Hello, Spring Boot!") String key, Model model) {
        model.addAttribute("key", key);
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required = false, defaultValue = "Hello, Spring Boot!") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
