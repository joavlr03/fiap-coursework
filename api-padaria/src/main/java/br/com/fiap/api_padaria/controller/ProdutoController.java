package br.com.fiap.api_padaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.api_padaria.model.ProdutoPadaria;
import br.com.fiap.api_padaria.repository.ProdutoPadariaRepository;

@RestController
@RequestMapping("api/${api.version}/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoPadariaRepository ProdutoPadaria;

    @PostMapping
    public ResponseEntity<ProdutoPadaria> create(@RequestBody ProdutoPadaria produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ProdutoPadaria.save(produto));
    }

    @GetMapping("produtos/disponiveis")
    public String disponiveis() {
        return "pães, lanches, doces e cafés";
    }

    @GetMapping("/{id}")    
    public ResponseEntity<ProdutoPadaria> findById(@PathVariable Long id) { 
        return ProdutoPadaria
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());        
    }

    @GetMapping
    public ResponseEntity<List<ProdutoPadaria>> findAll() {
        return ResponseEntity.ok(ProdutoPadaria.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoPadaria> update(@PathVariable Long id,
            @RequestBody ProdutoPadaria produto) {

        Optional<ProdutoPadaria> optProduto = ProdutoPadaria.findById(id);

        if (optProduto.isPresent()) {
            produto.setId(id);
            ProdutoPadaria produtoAlterado = ProdutoPadaria.save(produto);
            return ResponseEntity.ok(produtoAlterado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        ProdutoPadaria.deleteById(id);
        return ResponseEntity.noContent().build();

    }
}
