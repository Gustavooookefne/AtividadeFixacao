package com.weg.AtividadeFixacao.service;

import com.weg.AtividadeFixacao.dtos.PlanoDeTreinoDto;
import com.weg.AtividadeFixacao.model.PlanoDeTreino;
import com.weg.AtividadeFixacao.repository.AtletaRepository;
import com.weg.AtividadeFixacao.repository.PlanoDeTreinoRepository;
import com.weg.AtividadeFixacao.repository.TreinoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlanoDeTreinoService {

    private final PlanoDeTreinoRepository repository;
    private final AtletaRepository atletaRepository;
    private final TreinoRepository treinoRepository;

    public PlanoDeTreino salvar (PlanoDeTreinoDto dto){

        PlanoDeTreino plTreino = new PlanoDeTreino();
        plTreino.setNome(dto.nome());

        plTreino.setAtleta(atletaRepository.findById(dto.aletaId())
                .orElseThrow(() -> new RuntimeException("Atleta não encontrado")));


        plTreino.setTreinos(treinoRepository.findAllById(dto.treinosIds()));

        return repository.save(plTreino);
    }
}
