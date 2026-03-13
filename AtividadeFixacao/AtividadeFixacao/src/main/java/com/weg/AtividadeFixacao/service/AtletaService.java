package com.weg.AtividadeFixacao.service;

import com.weg.AtividadeFixacao.dtos.AtletaDto;
import com.weg.AtividadeFixacao.model.Atleta;
import com.weg.AtividadeFixacao.repository.AtletaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AtletaService {

    private final AtletaRepository repository;

    public Atleta salvar(AtletaDto dto){
        Atleta atleta = new Atleta();

        atleta.setNome(dto.nome());
        atleta.setEmial(dto.email());
        atleta.setPeso(dto.peso());
        atleta.setAltura(dto.altura());

        return repository.save(atleta);
    }

    public List<Atleta> listarTodos(){
        return repository.findAll();
    }

    public Atleta buscarPorId(UUID id){
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Atleta não encontrado" + id));
    }

    public void deletar(UUID id){
        repository.deleteById(id);
    }




}
