package com.escola.Senai.controller;

import com.escola.Senai.model.Peca;
import com.escola.Senai.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pecas")
@CrossOrigin("*")
public class PecaController {

    @Autowired
    private PecaRepository repository;

    @GetMapping
    public List<Peca> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Peca> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/buscar/{nome}")
    public List<Peca> buscarPorNome(@PathVariable String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    @PostMapping
    public Peca cadastrar(@RequestBody Peca peca) {
        return repository.save(peca);
    }

    @PutMapping("/{id}")
    public Peca atualizar(@PathVariable Long id, @RequestBody Peca peca) {
        peca.setId(id);
        return repository.save(peca);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}