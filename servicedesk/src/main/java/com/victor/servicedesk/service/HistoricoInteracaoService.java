package com.victor.servicedesk.service;

import com.victor.servicedesk.model.HistoricoInteracao;
import com.victor.servicedesk.repository.HistoricoInteracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HistoricoInteracaoService {

    @Autowired
    private HistoricoInteracaoRepository historicoInteracaoRepository;

    public HistoricoInteracao salvarHistoricoInteracao(HistoricoInteracao h) {
        return this.historicoInteracaoRepository.save(h);
    }

}
