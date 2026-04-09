
package com.escola.Senai.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mecanico")
public class Mecanico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(length = 100)
    private String especialidade;

    @Column(length = 20)
    private String telefone;

    @Column(length = 30)
    private String turno;

    public Mecanico() {
    }

    public Mecanico(Long id, String nome, String especialidade, String telefone, String turno) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.turno = turno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
} 
