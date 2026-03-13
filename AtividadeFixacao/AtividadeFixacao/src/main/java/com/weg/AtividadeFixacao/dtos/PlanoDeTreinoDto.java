package com.weg.AtividadeFixacao.dtos;

import java.util.List;
import java.util.UUID;

public record PlanoDeTreinoDto (
        String nome,
        UUID aletaId,
        List<Long> treinosIds

){

}
