package com.weg.AtividadeFixacao.controller;

import com.weg.AtividadeFixacao.dtos.ProgressoDto;
import com.weg.AtividadeFixacao.model.Progresso;
import com.weg.AtividadeFixacao.service.ProgressoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/progresso")
@AllArgsConstructor
public class ProgressoController {

    private final ProgressoService service;

    @PostMapping
    public Progresso criar (@RequestBody ProgressoDto dto){
        return service.salvar(dto);
    }

}
