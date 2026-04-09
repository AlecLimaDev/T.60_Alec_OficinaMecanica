package com.escola.Senai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.escola.Senai.model.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long> {
    List<Peca> findByNomeContainingIgnoreCase(String nome);
}
