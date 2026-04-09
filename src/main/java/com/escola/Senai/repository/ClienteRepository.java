package com.escola.Senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.escola.Senai.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNomeContainingIgnoreCase(String nome);
}