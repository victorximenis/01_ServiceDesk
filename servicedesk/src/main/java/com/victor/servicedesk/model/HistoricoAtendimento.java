package com.victor.servicedesk.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "historico_atendimentos")
public class HistoricoAtendimento extends Model {

    @ManyToOne
    @JoinColumn(name = "id_tecnico_origem")
    private Tecnico tecnicoOrigem;

    @ManyToOne
    @JoinColumn(name = "id_tecnico_destino")
    private Tecnico tecnicoDestino;

    @ManyToOne
    @JoinColumn(name = "id_atendimento_grupo_origem")
    private AtendimentoGrupo atendimentoGrupoOrigem;

    @ManyToOne
    @JoinColumn(name = "id_atendimento_grupo_destino")
    private AtendimentoGrupo atendimentoGrupoDestino;

    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToOne
    @JoinColumn(name = "id_ocorrencia")
    private Ocorrencia ocorrencia;

    public Tecnico getTecnicoOrigem() {
        return tecnicoOrigem;
    }

    public void setTecnicoOrigem(Tecnico tecnicoOrigem) {
        this.tecnicoOrigem = tecnicoOrigem;
    }

    public Tecnico getTecnicoDestino() {
        return tecnicoDestino;
    }

    public void setTecnicoDestino(Tecnico tecnicoDestino) {
        this.tecnicoDestino = tecnicoDestino;
    }

    public AtendimentoGrupo getAtendimentoGrupoOrigem() {
        return atendimentoGrupoOrigem;
    }

    public void setAtendimentoGrupoOrigem(AtendimentoGrupo atendimentoGrupoOrigem) {
        this.atendimentoGrupoOrigem = atendimentoGrupoOrigem;
    }

    public AtendimentoGrupo getAtendimentoGrupoDestino() {
        return atendimentoGrupoDestino;
    }

    public void setAtendimentoGrupoDestino(AtendimentoGrupo atendimentoGrupoDestino) {
        this.atendimentoGrupoDestino = atendimentoGrupoDestino;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
}
