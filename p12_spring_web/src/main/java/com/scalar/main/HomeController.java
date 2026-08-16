package com.scalar.main;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home() {
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    public String Add (@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 + num2;
        model.addAttribute("result", result);

        return "result";
    }

}
