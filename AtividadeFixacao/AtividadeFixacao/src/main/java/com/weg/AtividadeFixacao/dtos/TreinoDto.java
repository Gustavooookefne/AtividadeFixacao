package com.weg.AtividadeFixacao.dtos;

import java.util.List;

public record TreinoDto (
        String nome,
        String observacao,
        List<Long> exerciciosIds
){
}
