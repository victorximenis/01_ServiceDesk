package com.victor.servicedesk.service;

import com.victor.servicedesk.model.AtendimentoGrupo;
import com.victor.servicedesk.model.Tecnico;
import com.victor.servicedesk.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private AtendimentoGrupoService atendimentoGrupoService;

    public Tecnico cadastrarAtendente(Tecnico t) throws Exception {
        if (t.getAtendimentoGrupo() != null && t.getAtendimentoGrupo().getId() != null) {
            AtendimentoGrupo ag = this.atendimentoGrupoService.buscarPorId(t.getAtendimentoGrupo().getId());
            return this.tecnicoRepository.save(t);
        } else {
            throw new Exception("AtendimentoGrupo Ausente");
        }
    }

}
