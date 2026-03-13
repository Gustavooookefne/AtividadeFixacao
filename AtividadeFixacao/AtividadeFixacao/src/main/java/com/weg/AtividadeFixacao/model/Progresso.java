package com.weg.AtividadeFixacao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Progresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private LocalDate date;
    private double carga;
    private int repeticoes;

    @ManyToOne
    private Atleta atleta;

    @ManyToMany
    private Exercicio exercicioe;
}
