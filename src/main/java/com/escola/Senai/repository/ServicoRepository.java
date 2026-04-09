package com.escola.Senai.repository;

import com.escola.Senai.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    List<Servico> findByDescricaoContainingIgnoreCase(String descricao);
}
