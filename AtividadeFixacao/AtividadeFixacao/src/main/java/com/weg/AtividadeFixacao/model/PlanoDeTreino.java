package com.weg.AtividadeFixacao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PlanoDeTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String nome;

    // indica que uma tabela com varios progressos tem um  unico registro N pra 1
    @ManyToOne
    private Atleta atleta;

    // indica que um registro pai tem uma lista de varios filhos 1 pra N
    @OneToMany
    private List<Treino> treinos;
}
