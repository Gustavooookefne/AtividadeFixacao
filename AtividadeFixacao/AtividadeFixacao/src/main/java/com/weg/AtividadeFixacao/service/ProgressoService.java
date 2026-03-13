package com.weg.AtividadeFixacao.service;

import com.weg.AtividadeFixacao.dtos.ProgressoDto;
import com.weg.AtividadeFixacao.model.Progresso;
import com.weg.AtividadeFixacao.repository.AtletaRepository;
import com.weg.AtividadeFixacao.repository.ExercicioRepository;
import com.weg.AtividadeFixacao.repository.ProgressoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProgressoService {

    private final ProgressoRepository repository;
    private final AtletaRepository atletaRepository;
    private final ExercicioRepository exercicioRepository;

    public Progresso salvar(ProgressoDto dto){

        Progresso progresso = new Progresso();

        progresso.setCarga(dto.carga());
        progresso.setRepeticoes(dto.repeticoes());

        progresso.setAtleta(atletaRepository.findById(dto.aletaId())
                .orElseThrow(() -> new RuntimeException("Atleta não encontrado")));

        progresso.setExercicioe(exercicioRepository.findById(dto.exercicioId())
                .orElseThrow(() -> new RuntimeException("Exercicio não encontrado")));

        return repository.save(progresso);
    }

    public List<Progresso> listarTodos(UUID atletaId){
        return repository.findAll().stream()
                .filter(p -> p.getAtleta().getId().equals(atletaId))
                .toList();
    }
}
