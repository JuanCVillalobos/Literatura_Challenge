package com.aluracursos.JC.repository;

import com.aluracursos.JC.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByAutor(String autor);

    @Query("SELECT a FROM Autor a WHERE a.fechaDeNacimiento <= :ano AND a.fechaDeFallecimiento >= :ano")
    List<Autor> listarAutoresRegistradosVivosPorAno(int ano);
}
