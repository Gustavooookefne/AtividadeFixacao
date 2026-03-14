package com.weg.AtividadeFixacao.mapper;

import com.weg.AtividadeFixacao.dtos.AtletaDto;
import com.weg.AtividadeFixacao.model.Atleta;
import org.springframework.stereotype.Component;

@Component
public class AtletaMapper {

    public Atleta paraEntidade (AtletaDto atletaDto){

        return new Atleta(
                atletaDto.nome(),
                atletaDto.email(),
                atletaDto.idade(),
                atletaDto.peso(),
                atletaDto.altura()

        );
    }

    public Atleta paraDtos(Atleta atleta){

        return new Atleta(
                atleta.getId(),
                atleta.getNome(),
                atleta.getEmial(),
                atleta.getIdade(),
                atleta.getPeso(),
                atleta.getPeso(),
                atleta.getAltura()
        );
    }

}
