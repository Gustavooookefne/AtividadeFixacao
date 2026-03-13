package com.weg.AtividadeFixacao.repository;

import com.weg.AtividadeFixacao.model.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

// aqui no repositry não vamos precisar usar o @Repository, por conta que
// quando vc faz seu codigo herdar do JpaRepository, ele já entende que é um coponente que acessa dados
// e ele cria para min já
public interface AtletaRepository extends JpaRepository<Atleta, UUID> {

}
