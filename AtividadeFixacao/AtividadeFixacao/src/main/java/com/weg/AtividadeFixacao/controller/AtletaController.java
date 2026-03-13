package com.weg.AtividadeFixacao.controller;

import com.weg.AtividadeFixacao.dtos.AtletaDto;
import com.weg.AtividadeFixacao.model.Atleta;
import com.weg.AtividadeFixacao.service.AtletaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/atletas")
@AllArgsConstructor
public class AtletaController {

    private final AtletaService service;

    @PostMapping
    public Atleta criar (@RequestBody AtletaDto dto){
        return service.salvar(dto);
    }

    @GetMapping
    public List<Atleta> buscarTodosAtletas(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Atleta buscarId(@PathVariable UUID id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable UUID id){
        service.deletar(id);
    }
}
