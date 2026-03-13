package com.weg.AtividadeFixacao.service;

import com.weg.AtividadeFixacao.dtos.ExercicioDto;
import com.weg.AtividadeFixacao.model.Exercicio;
import com.weg.AtividadeFixacao.repository.ExercicioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ExercicioService {

    private final ExercicioRepository repository;

    public Exercicio salvar(ExercicioDto dto){

        Exercicio exercicio = new Exercicio();

        exercicio.setNome(dto.nome());
        exercicio.setGrupoMuscular(dto.grupoMuscular());
        exercicio.setEquipamento(dto.equipamento());
        exercicio.setVideoUrl(dto.videoUrl());

        return repository.save(exercicio);
    }

    public List<Exercicio> buscarTodos(){
        return repository.findAll();
    }

    public Exercicio buscarPorId(long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Exercicio não encontrado" + id));
    }

    public void deletar(long id){
        repository.deleteById(id);
    }
}
