package com.luisHenrique.angularSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisHenrique.angularSpring.domain.Modelos;

@Repository
public interface ModeloRepository extends JpaRepository<Modelos, Integer>{

}
