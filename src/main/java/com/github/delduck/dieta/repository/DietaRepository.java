package com.github.delduck.dieta.repository;

import com.github.delduck.dieta.model.Dieta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DietaRepository extends JpaRepository<Dieta, Long> {

    List<Dieta> findByDia(LocalDate dia);
}
