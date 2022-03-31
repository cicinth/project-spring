package com.revisao.banco.revisaoBanco.controller;

import com.revisao.banco.revisaoBanco.model.Cliente;
import com.revisao.banco.revisaoBanco.request.ClienteRequest;
import com.revisao.banco.revisaoBanco.response.ClienteResponse;
import com.revisao.banco.revisaoBanco.service.ClienteSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteSevice clienteSevice;

    @PostMapping
    public ResponseEntity<ClienteResponse> cadastraCliente(
            @RequestBody @Valid ClienteRequest clienteRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Cliente cliente = clienteSevice.cadastraCliente(clienteRequest);

        URI uri = uriComponentsBuilder.path("/cliente/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).body(new ClienteResponse(cliente));
    }

    @GetMapping
    public Cliente buscaClientes(){
        Cliente cliente = new Cliente(UUID.randomUUID(), "cinthi", "cinthiaqcard", "4534534");
        return cliente;
    }

}
