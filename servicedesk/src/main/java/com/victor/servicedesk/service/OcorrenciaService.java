package com.victor.servicedesk.service;

import com.victor.servicedesk.model.Ocorrencia;
import com.victor.servicedesk.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository ocorrenciaRepository;


    public Ocorrencia salvarOcorrencia(Ocorrencia o) {
        return this.ocorrenciaRepository.save(o);
    }

    public Ocorrencia buscarPorId(Long id) {
        Optional<Ocorrencia> op = this.ocorrenciaRepository.findById(id);
        if (op.isPresent()) {
            return op.get();
        } else {
            return null;
        }
    }

}
