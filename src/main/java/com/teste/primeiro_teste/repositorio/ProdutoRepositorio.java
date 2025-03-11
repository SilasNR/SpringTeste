package com.teste.primeiro_teste.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.primeiro_teste.domain.produto.produto;
import java.util.UUID;

public interface ProdutoRepositorio extends JpaRepository<produto, UUID> {

    

    
}
