package com.victor.servicedesk.service;

import com.victor.servicedesk.model.Cliente;
import com.victor.servicedesk.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente cadastrarCliente(Cliente c) {
        return clienteRepository.save(c);
    }

}
