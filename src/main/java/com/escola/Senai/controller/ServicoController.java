package com.escola.Senai.controller;

import com.escola.Senai.model.Servico;
import com.escola.Senai.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicos")
@CrossOrigin("*")
public class ServicoController {

    @Autowired
    private ServicoRepository repository;

    @GetMapping
    public List<Servico> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Servico> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/buscar/{descricao}")
    public List<Servico> buscarPorDescricao(@PathVariable String descricao) {
        return repository.findByDescricaoContainingIgnoreCase(descricao);
    }

    @PostMapping
    public Servico cadastrar(@RequestBody Servico servico) {
        return repository.save(servico);
    }

    @PutMapping("/{id}")
    public Servico atualizar(@PathVariable Long id, @RequestBody Servico servico) {
        servico.setId(id);
        return repository.save(servico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
