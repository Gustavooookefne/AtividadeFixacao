package com.weg.AtividadeFixacao.dtos;

import java.util.UUID;

public record ProgressoDto (
        double carga,
        int repeticoes,
        UUID aletaId,
        Long exercicioId
){
}
