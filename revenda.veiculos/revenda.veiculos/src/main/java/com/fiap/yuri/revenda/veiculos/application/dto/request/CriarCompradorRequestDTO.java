package com.fiap.yuri.revenda.veiculos.application.dto.request;

import lombok.Data;

@Data
public class CriarCompradorRequestDTO {
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String endereco;
}