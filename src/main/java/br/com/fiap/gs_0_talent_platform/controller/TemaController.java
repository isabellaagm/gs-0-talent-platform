package br.com.fiap.gs_0_talent_platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of(
                "tema", "Plataformas que conectam talentos a projetos com propósito",
                "membro1", "Ana Luiza de Paula Reis",
                "membro2", "Isabella Gomes Menezes",
                "descricao", "Exploramos como criar plataformas digitais que aproximam profissionais e talentos de projetos com impacto real, alinhando habilidades individuais com causas, empresas e iniciativas que geram propósito, não só salário."
        );
    }
}
