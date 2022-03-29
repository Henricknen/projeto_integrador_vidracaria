package com.luisHenrique.angularSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisHenrique.angularSpring.domain.Vidros;

@Repository
public interface VidrosRepository extends JpaRepository<Vidros, Integer>{

}
