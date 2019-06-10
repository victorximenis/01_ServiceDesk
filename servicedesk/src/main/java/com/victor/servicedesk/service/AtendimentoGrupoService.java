package com.victor.servicedesk.service;

import com.victor.servicedesk.model.AtendimentoGrupo;
import com.victor.servicedesk.repository.AtendimentoGrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AtendimentoGrupoService {

    @Autowired
    private AtendimentoGrupoRepository atendimentoGrupoRepository;

    public AtendimentoGrupo cadastrarAtendimentoGrupo(AtendimentoGrupo a) {
        return this.atendimentoGrupoRepository.save(a);
    }

    public AtendimentoGrupo buscarPorId(Long id) {

        Optional<AtendimentoGrupo> opAtendimentoGrupo = this.atendimentoGrupoRepository.findById(id);
        if (opAtendimentoGrupo.isPresent()) {
            return opAtendimentoGrupo.get();
        } else {
            return null;
        }
    }

}
