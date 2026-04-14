package com.github.victoruizz.crud.repository;

import com.github.victoruizz.crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
