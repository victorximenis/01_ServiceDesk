package com.victor.servicedesk.web.rest;

import com.victor.servicedesk.model.Tecnico;
import com.victor.servicedesk.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/atendentes")
public class AtendenteResource {

    @Autowired
    private TecnicoService tecnicoService;

    @PostMapping
    public Tecnico cadastrarAtendente(@RequestBody Tecnico t) throws Exception {
        return this.tecnicoService.cadastrarAtendente(t);
    }

}
