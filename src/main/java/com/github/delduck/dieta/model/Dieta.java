package com.github.delduck.dieta.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dieta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dia;
    private LocalTime horario;

    @OneToMany(mappedBy = "dieta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alimento> alimentos;

}
