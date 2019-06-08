package com.victor.servicedesk.model;

import com.victor.servicedesk.enums.TipoSolucaoOcorrenciaEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name = "solucoes_ocorrencia")
public class SolucaoOcorrencia extends Model {

    @Column(name = "descricao")
    private String descricao;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tipo_solucao_ocorrencia")
    private TipoSolucaoOcorrenciaEnum tipoSolucaoOcorrencia;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoSolucaoOcorrenciaEnum getTipoSolucaoOcorrencia() {
        return tipoSolucaoOcorrencia;
    }

    public void setTipoSolucaoOcorrencia(TipoSolucaoOcorrenciaEnum tipoSolucaoOcorrencia) {
        this.tipoSolucaoOcorrencia = tipoSolucaoOcorrencia;
    }
}
