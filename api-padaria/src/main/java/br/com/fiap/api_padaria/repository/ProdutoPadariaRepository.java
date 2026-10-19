package br.com.fiap.api_padaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.api_padaria.model.ProdutoPadaria;

@Repository
public interface ProdutoPadariaRepository extends   JpaRepository <ProdutoPadaria, Long>{

  
}
