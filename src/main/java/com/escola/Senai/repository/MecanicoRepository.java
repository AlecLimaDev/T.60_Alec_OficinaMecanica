package com.escola.Senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.escola.Senai.model.Mecanico;

public interface MecanicoRepository extends JpaRepository<Mecanico, Long> {
    List<Mecanico> findByNomeContainingIgnoreCase(String nome);
}