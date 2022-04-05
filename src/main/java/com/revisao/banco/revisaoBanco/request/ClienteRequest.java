package com.revisao.banco.revisaoBanco.request;

import com.revisao.banco.revisaoBanco.utils.validacoes.BATATA;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class ClienteRequest {
    @NotEmpty @NotNull(message = "nao pode ser null vacilao") @Size(min = 2) @BATATA
    private String nome;
    @NotEmpty @NotNull @Email
    private String email;
    @NotEmpty @NotNull
    private String senha;
}
