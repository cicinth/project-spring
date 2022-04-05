package com.revisao.banco.revisaoBanco.controller;

import com.revisao.banco.revisaoBanco.model.Cliente;
import com.revisao.banco.revisaoBanco.request.ClienteRequest;
import com.revisao.banco.revisaoBanco.response.ClienteResponse;
import com.revisao.banco.revisaoBanco.service.ClienteSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteSevice clienteSevice;

    Logger logger = Logger.getLogger("MeuLog");

    @PostMapping
    @CacheEvict(value = "listaClientes", allEntries = true

    )
    public ResponseEntity<ClienteResponse> cadastraCliente(
            @RequestBody @Valid ClienteRequest clienteRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Cliente cliente = clienteSevice.cadastraCliente(clienteRequest);
        URI uri = uriComponentsBuilder.path("/cliente/{id}").buildAndExpand(cliente.getId()).toUri();
        logger.info("Usuario cadastrado");
        return ResponseEntity.created(uri).body(new ClienteResponse(cliente));
    }

    @GetMapping
    @Cacheable(value = "listaClientes")
    public List<Cliente> buscaClientes(){
        return clienteSevice.buscaCliente();
    }

}
