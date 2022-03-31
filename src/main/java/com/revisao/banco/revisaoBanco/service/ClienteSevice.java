package com.revisao.banco.revisaoBanco.service;

import com.revisao.banco.revisaoBanco.model.Cliente;
import com.revisao.banco.revisaoBanco.request.ClienteRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
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
}
