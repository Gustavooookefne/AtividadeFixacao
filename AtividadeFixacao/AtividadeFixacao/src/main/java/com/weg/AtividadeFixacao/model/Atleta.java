package com.weg.AtividadeFixacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Atleta {

    // na parte do Generation ele diz "Como o id vai ser gerado"
    // IDENTITY - o banco de dados vai ficar responsavel por dizer qual é o proximo id
    // UUID - ele vai criptografar o seu id
    // SEQUENCE - ele vai seguir uma sequencia, organização
    // AUTO - ele vai decidir para vc qual é a melhor forma com base no seu banco de dados
    // TABLE - cria uma tabela para guardar o ultimo id gerado

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String emial;
    private int idade;
    private double peso;
    private double altura;

}