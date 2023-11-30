package com.senac.br.Tela.Cadastro.Controller;
import com.senac.br.Tela.Cadastro.dao.RegistroRepository;
import com.senac.br.Tela.Cadastro.model.Registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CadastroController {

    @Autowired
    RegistroRepository RegistroRepository;

    @GetMapping("/cadastro")
    public String abrir(Registro registro) {
        return "cadastro";
    }

    @PostMapping("/Registro")
    public String cadastrar(Registro registro) {

        RegistroRepository.save(registro);
        return "index";
    }
}

