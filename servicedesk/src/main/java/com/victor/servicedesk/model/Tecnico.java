package com.victor.servicedesk.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity(name = "tecnicos")
public class Tecnico extends Model {

    @OneToOne
    @JoinColumn(name = "id_pessoa")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Pessoa pessoa;

    @Column(name = "setor")
    private String setor;

    @ManyToOne
    @JoinColumn(name = "id_atendimento_grupo")
    private AtendimentoGrupo atendimentoGrupo;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public AtendimentoGrupo getAtendimentoGrupo() {
        return atendimentoGrupo;
    }

    public void setAtendimentoGrupo(AtendimentoGrupo atendimentoGrupo) {
        this.atendimentoGrupo = atendimentoGrupo;
    }
}
