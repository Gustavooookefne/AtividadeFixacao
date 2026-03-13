package com.weg.AtividadeFixacao.controller;

import com.weg.AtividadeFixacao.dtos.ExercicioDto;
import com.weg.AtividadeFixacao.model.Exercicio;
import com.weg.AtividadeFixacao.service.ExercicioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/exercicios")
@AllArgsConstructor
public class ExercicioController {

    private final ExercicioService service;

    @PostMapping
    public Exercicio criar (@RequestBody ExercicioDto dto){
        return service.salvar(dto);
    }

    @GetMapping
    public List<Exercicio> buscarTodosExercicios(){
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public Exercicio buscarId(@PathVariable long id){
        return service.buscarPorId(id);
    }
}
