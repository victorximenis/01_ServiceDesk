package com.victor.servicedesk.repository;

import com.victor.servicedesk.model.AtendimentoGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoGrupoRepository extends JpaRepository<AtendimentoGrupo, Long> {
}
