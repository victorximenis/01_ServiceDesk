package com.victor.servicedesk.web.rest;

import com.victor.servicedesk.model.Cliente;
import com.victor.servicedesk.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente c) {
        Cliente cl = this.clienteService.cadastrarCliente(c);
        return cl;
    }

}
