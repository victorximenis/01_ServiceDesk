package com.victor.servicedesk.web.rest;

import com.victor.servicedesk.model.HistoricoInteracao;
import com.victor.servicedesk.model.Ocorrencia;
import com.victor.servicedesk.service.HistoricoInteracaoService;
import com.victor.servicedesk.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ocorrencias")
public class OcorrenciaResource {

    @Autowired
    private OcorrenciaService ocorrenciaService;

    @Autowired
    private HistoricoInteracaoService historicoInteracaoService;

    @PostMapping
    public Ocorrencia cadastrarOcorrencia(@RequestBody Ocorrencia o) {
        return this.ocorrenciaService.salvarOcorrencia(o);
    }

    @PostMapping("/{idOcorrencia}")
    public Ocorrencia resolverOcorrencia(@RequestBody Ocorrencia objOc, @PathVariable Long idOcorrencia) throws Exception {

        Ocorrencia oc = this.ocorrenciaService.buscarPorId(idOcorrencia);
        if (oc != null) {

            oc.setStatusOcorrenciaEnum(objOc.getStatusOcorrenciaEnum());
            oc.setSolucaoOcorrencia(objOc.getSolucaoOcorrencia());

            return this.ocorrenciaService.salvarOcorrencia(oc);

        } else {
            throw new Exception("Ocorrencia nao encontrada");
        }

    }

    @PostMapping("/{idOcorrencia}/cadastrar-historico")
    public HistoricoInteracao cadastrarHistoricoInteracao(@RequestBody HistoricoInteracao h, @PathVariable Long idOcorrencia) throws Exception {

        Ocorrencia oc = this.ocorrenciaService.buscarPorId(idOcorrencia);
        if (oc != null) {

            return this.historicoInteracaoService.salvarHistoricoInteracao(h);

        } else {
            throw new Exception("Ocorrencia nao encontrada");
        }

    }

}
