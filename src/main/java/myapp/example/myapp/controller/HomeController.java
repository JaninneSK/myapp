package myapp.example.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
                "mensagem",
                "Versão 2 - Primeira alteração da etapa 2");

        return "home";
    }
}