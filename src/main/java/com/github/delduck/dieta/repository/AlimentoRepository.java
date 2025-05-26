package com.github.delduck.dieta.repository;

import com.github.delduck.dieta.model.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
}
