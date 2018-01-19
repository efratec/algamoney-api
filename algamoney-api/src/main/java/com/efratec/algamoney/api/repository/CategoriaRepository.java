package com.efratec.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efratec.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
