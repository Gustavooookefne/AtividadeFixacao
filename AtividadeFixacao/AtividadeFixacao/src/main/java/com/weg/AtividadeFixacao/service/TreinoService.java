package com.weg.AtividadeFixacao.service;

import com.weg.AtividadeFixacao.dtos.TreinoDto;
import com.weg.AtividadeFixacao.model.Exercicio;
import com.weg.AtividadeFixacao.model.Treino;
import com.weg.AtividadeFixacao.repository.ExercicioRepository;
import com.weg.AtividadeFixacao.repository.TreinoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TreinoService {

    private final TreinoRepository repository;
    private final ExercicioRepository exercicioRepository;

    public Treino salvar (TreinoDto dto){
        Treino treino = new Treino();
        treino.setNome(dto.nome());
        treino.setObservacao(dto.observacao());

        List<Exercicio> exerciciosEncontrado = exercicioRepository.findAllById(dto.exerciciosIds());

        treino.setExercicio(exerciciosEncontrado);

        return repository.save(treino);
    }

    public List<Treino> listarTodos(){
        return repository.findAll();
    }
}
