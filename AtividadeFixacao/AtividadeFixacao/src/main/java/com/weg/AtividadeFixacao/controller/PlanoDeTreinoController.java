package com.weg.AtividadeFixacao.controller;

import com.weg.AtividadeFixacao.dtos.PlanoDeTreinoDto;
import com.weg.AtividadeFixacao.model.PlanoDeTreino;
import com.weg.AtividadeFixacao.service.PlanoDeTreinoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planoDeTreino")
@AllArgsConstructor
public class PlanoDeTreinoController {

    private final PlanoDeTreinoService service;

    @PostMapping
    public PlanoDeTreino criar (@RequestBody PlanoDeTreinoDto dto){
        return service.salvar(dto);
    }


}
