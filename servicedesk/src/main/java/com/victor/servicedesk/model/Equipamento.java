package com.victor.servicedesk.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "equipamentos")
public class Equipamento extends Model {
    @Column(name = "nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
