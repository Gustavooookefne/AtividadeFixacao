package com.weg.AtividadeFixacao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String observacao;

    @ManyToMany
    private List<Exercicio> exercicio;

}
