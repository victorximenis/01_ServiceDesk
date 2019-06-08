package com.victor.servicedesk.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "atendimento_grupos")
public class AtendimentoGrupo extends Model {

    @Column(name = "nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
