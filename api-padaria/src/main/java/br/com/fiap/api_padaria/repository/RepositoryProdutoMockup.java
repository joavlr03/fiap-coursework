package br.com.fiap.api_padaria.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiap.api_padaria.model.ProdutoPadaria;

@Service
public class RepositoryProdutoMockup {
private List<ProdutoPadaria> produtos = new ArrayList<>();
    private long ID = 1L;
    
    public RepositoryProdutoMockup() {        
        produtos.add(new ProdutoPadaria(ID++, "Pão na Chapa", BigDecimal.valueOf(7.50)));  
        produtos.add(new ProdutoPadaria(ID++, "Café", BigDecimal.valueOf(2.25)));            
    }

    public List<ProdutoPadaria> findAll() {
        return produtos;
    }

    public Optional<ProdutoPadaria> findById(Long id){
        return produtos.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst();
    }

    public boolean deleteById(Long id) {
        return produtos.removeIf(p -> p.getId().equals(id));
    }

    public ProdutoPadaria create(ProdutoPadaria produto) {        
        // atribuir o id novo ao produto a ser cadastrado
        produto.setId(ID++);        
        // salvar no BD
        produtos.add(produto);
        // retornar o produto novo        
        return produto;
    }

    public boolean update(Long id, ProdutoPadaria produto) {
        Optional<ProdutoPadaria> optProduto = this.findById(id);
        
        if (optProduto.isPresent()) {
            ProdutoPadaria produtoAtual = optProduto.get();
            produtoAtual.setNome(produto.getNome());
            produtoAtual.setValor(produto.getValor());
            return true;
        }

        return false;
    }

}
