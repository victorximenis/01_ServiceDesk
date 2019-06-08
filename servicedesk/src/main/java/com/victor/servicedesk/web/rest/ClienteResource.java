package com.victor.servicedesk.web.rest;

import com.victor.servicedesk.model.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/clientes")
public class ClienteResource {

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente c) {
        return c;
    }

}
