package br.com.fiap.api_padaria.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CategoriasController {
    @GetMapping("/CategoriasPadaria")
    public String categorias() {
        return "Categorias de nossa padaria: Cafés, Laticínios, Pães, Frios ";
    }

}
