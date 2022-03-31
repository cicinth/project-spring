package com.revisao.banco.revisaoBanco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class Cliente {
    private UUID id;
    private String nome;
    private String email;
    private String senha;
}
