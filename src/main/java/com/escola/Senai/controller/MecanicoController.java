package com.escola.Senai.controller;

import com.escola.Senai.model.Mecanico;
import com.escola.Senai.repository.MecanicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mecanicos")
@CrossOrigin("*")
public class MecanicoController {

    @Autowired
    private MecanicoRepository repository;

    @GetMapping
    public List<Mecanico> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Mecanico> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/buscar/{nome}")
    public List<Mecanico> buscarPorNome(@PathVariable String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    @PostMapping
    public Mecanico cadastrar(@RequestBody Mecanico mecanico) {
        return repository.save(mecanico);
    }

    @PutMapping("/{id}")
    public Mecanico atualizar(@PathVariable Long id, @RequestBody Mecanico mecanico) {
        mecanico.setId(id);
        return repository.save(mecanico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}