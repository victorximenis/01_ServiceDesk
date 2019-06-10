package com.victor.servicedesk.model;

import com.victor.servicedesk.enums.OcorrenciaUrgenciaEnum;
import com.victor.servicedesk.enums.StatusOcorrenciaEnum;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "ocorrencias")
public class Ocorrencia extends Model {

    @Temporal(TemporalType.DATE)
    @Column(name = "data_hora")
    private Date dataHora;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ocorrencia_urgencia")
    private OcorrenciaUrgenciaEnum ocorrenciaUrgencia;

    @Column(name = "solicitacao")
    private String solicitacao;

    @ManyToOne
    @JoinColumn(name = "id_tecnico")
    private Tecnico tecnico;

    @ManyToMany
    private List<Equipamento> equipamentos;

    @OneToMany(mappedBy = "ocorrencia")
    private List<HistoricoInteracao> historicoInteracao;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status_ocorrencia")
    private StatusOcorrenciaEnum statusOcorrenciaEnum;

    @ManyToOne
    @JoinColumn(name = "id_atendimento_grupo")
    private AtendimentoGrupo atendimentoGrupo;

    @OneToMany(mappedBy = "ocorrencia")
    private List<HistoricoAtendimento> historicoAtendimento;

    @OneToOne
    @JoinColumn(name = "id_solucao_ocorrencia")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private SolucaoOcorrencia solucaoOcorrencia;

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public OcorrenciaUrgenciaEnum getOcorrenciaUrgencia() {
        return ocorrenciaUrgencia;
    }

    public void setOcorrenciaUrgencia(OcorrenciaUrgenciaEnum ocorrenciaUrgencia) {
        this.ocorrenciaUrgencia = ocorrenciaUrgencia;
    }

    public String getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<HistoricoInteracao> getHistoricoInteracao() {
        return historicoInteracao;
    }

    public void setHistoricoInteracao(List<HistoricoInteracao> historicoInteracao) {
        this.historicoInteracao = historicoInteracao;
    }

    public StatusOcorrenciaEnum getStatusOcorrenciaEnum() {
        return statusOcorrenciaEnum;
    }

    public void setStatusOcorrenciaEnum(StatusOcorrenciaEnum statusOcorrenciaEnum) {
        this.statusOcorrenciaEnum = statusOcorrenciaEnum;
    }

    public AtendimentoGrupo getAtendimentoGrupo() {
        return atendimentoGrupo;
    }

    public void setAtendimentoGrupo(AtendimentoGrupo atendimentoGrupo) {
        this.atendimentoGrupo = atendimentoGrupo;
    }

    public List<HistoricoAtendimento> getHistoricoAtendimento() {
        return historicoAtendimento;
    }

    public void setHistoricoAtendimento(List<HistoricoAtendimento> historicoAtendimento) {
        this.historicoAtendimento = historicoAtendimento;
    }

    public SolucaoOcorrencia getSolucaoOcorrencia() {
        return solucaoOcorrencia;
    }

    public void setSolucaoOcorrencia(SolucaoOcorrencia solucaoOcorrencia) {
        this.solucaoOcorrencia = solucaoOcorrencia;
    }
}
