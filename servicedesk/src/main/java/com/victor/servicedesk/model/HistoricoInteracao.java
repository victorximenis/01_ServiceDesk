package com.victor.servicedesk.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "historico_interacao")
public class HistoricoInteracao extends Model {

    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "observacao")
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "id_equipamento")
    private Equipamento equipamento;

    @OneToMany
    @JoinColumn(name = "id_ocorrencia")
    private Ocorrencia ocorrencia;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
}
