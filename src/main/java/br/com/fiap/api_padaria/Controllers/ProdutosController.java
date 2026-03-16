package br.com.fiap.api_padaria.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class ProdutosController {

    @GetMapping("/produtos")
    public String produtos() {
        return "Lista de produtos disponíveis em nossa padaria:";
    }

    @GetMapping("produtos/disponiveis")
    public String disponiveis() {
        return "pães, lanches, doces e cafés";
    }
}
