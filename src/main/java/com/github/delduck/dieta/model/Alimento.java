package com.github.delduck.dieta.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double quantidade;
    private String unidadeMedida;
    private Integer calorias;

    @ManyToOne
    @JoinColumn(name = "dieta_id")
    @JsonIgnore
    private Dieta dieta;

}
