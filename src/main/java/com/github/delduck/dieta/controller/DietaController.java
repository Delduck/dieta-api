package com.github.delduck.dieta.controller;

import com.github.delduck.dieta.model.Dieta;
import com.github.delduck.dieta.service.DietaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/dietas")
public class DietaController {

    @Autowired
    private DietaService dietaService;

    @PostMapping("/adicionar")
    public ResponseEntity<Dieta> criarDieta(@RequestBody Dieta dieta) {
        Dieta novaDieta = dietaService.adicionaDieta(dieta);
        return ResponseEntity.ok(novaDieta);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Dieta>> listarDietas() {
        List<Dieta> dietas = dietaService.listarDietas();
        return ResponseEntity.ok(dietas);
    }

    @GetMapping("/dia")
    public ResponseEntity<List<Dieta>> listarDietaPorDia(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dia) {
        List<Dieta> dietas = dietaService.listarDietasPorDia(dia);
        return ResponseEntity.ok(dietas);
    }

}
