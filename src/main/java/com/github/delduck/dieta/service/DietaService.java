package com.github.delduck.dieta.service;

import com.github.delduck.dieta.model.Dieta;
import com.github.delduck.dieta.repository.DietaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DietaService {

    @Autowired
    private DietaRepository dietaRepository;

    public Dieta adicionaDieta(Dieta dieta) {
        dieta.getAlimentos().forEach(a -> a.setDieta(dieta));
        return dietaRepository.save(dieta);
    }

    public List<Dieta> listarDietas() {
        return dietaRepository.findAll();
    }

    public List<Dieta> listarDietasPorDia(LocalDate dia) {
        return dietaRepository.findByDia(dia);
    }

}
