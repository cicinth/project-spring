package com.revisao.banco.revisaoBanco.response;

import com.revisao.banco.revisaoBanco.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class ClienteResponse {
    private UUID id;
    private String nome;
    private String email;

    public ClienteResponse(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
    }
}
