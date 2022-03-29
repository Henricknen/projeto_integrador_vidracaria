package com.luisHenrique.angularSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisHenrique.angularSpring.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
