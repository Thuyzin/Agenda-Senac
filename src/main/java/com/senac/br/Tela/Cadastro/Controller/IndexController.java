package com.senac.br.Tela.Cadastro.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {
    @GetMapping("/index")
    public String abrir() {
        return "index";
    }

}