package com.victor.servicedesk.repository;

import com.victor.servicedesk.model.HistoricoInteracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoInteracaoRepository extends JpaRepository<HistoricoInteracao, Long> {
}
