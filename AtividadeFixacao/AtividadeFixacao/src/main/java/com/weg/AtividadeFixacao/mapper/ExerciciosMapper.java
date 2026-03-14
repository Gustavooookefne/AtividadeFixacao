package com.weg.AtividadeFixacao.mapper;

import com.weg.AtividadeFixacao.dtos.ExercicioDto;
import com.weg.AtividadeFixacao.model.Exercicio;
import org.springframework.stereotype.Component;

@Component
public class ExerciciosMapper {

    public Exercicio paraEntidade(ExercicioDto exercicioDto){

        return new Exercicio(
                exercicioDto.nome(),
                exercicioDto.equipamento(),
                exercicioDto.grupoMuscular(),
                exercicioDto.videoUrl()
        );
    }

    public Exercicio paraDtos(Exercicio exercicio){

        return new Exercicio(
                exercicio.getId(),
                exercicio.getNome(),
                exercicio.getEquipamento(),
                exercicio.getEquipamento(),
                exercicio.setVideoUrl()
        );
    }
}
