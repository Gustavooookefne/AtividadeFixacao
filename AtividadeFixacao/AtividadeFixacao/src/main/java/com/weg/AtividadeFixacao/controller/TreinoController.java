package com.weg.AtividadeFixacao.controller;

import com.weg.AtividadeFixacao.dtos.TreinoDto;
import com.weg.AtividadeFixacao.model.Treino;
import com.weg.AtividadeFixacao.service.TreinoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treino")
@AllArgsConstructor
public class TreinoController {

    private final TreinoService service;

    @PostMapping
    public Treino criar(@RequestBody TreinoDto dto){
        return service.salvar(dto);
    }

    @GetMapping
    public List<Treino> buscarTodos(){
        return service.listarTodos();
    }
}
