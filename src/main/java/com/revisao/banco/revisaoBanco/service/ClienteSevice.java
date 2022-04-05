package com.revisao.banco.revisaoBanco.service;

import com.revisao.banco.revisaoBanco.model.Cliente;
import com.revisao.banco.revisaoBanco.request.ClienteRequest;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class ClienteSevice {

    public Cliente cadastraCliente(ClienteRequest clienteRequest){
        Cliente cliente = new Cliente(
                UUID.randomUUID(),
                clienteRequest.getNome(),
                clienteRequest.getEmail(),
                clienteRequest.getSenha()
        );

        return cliente;
    }

    public List<Cliente> buscaCliente(){
        log.info("buscando clientes .... ");
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new Cliente(UUID.randomUUID(), "cinthi", "cinthiaqcard", "4534534");
        Cliente cliente2 = new Cliente(UUID.randomUUID(), "cinthi", "cinthiaqcard", "4534534");

        clientes.add(cliente);
        clientes.add(cliente2);

        return clientes;

    }
}
