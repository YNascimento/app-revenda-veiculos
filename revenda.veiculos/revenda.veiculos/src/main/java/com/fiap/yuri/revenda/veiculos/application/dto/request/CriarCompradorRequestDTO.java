package com.fiap.yuri.revenda.veiculos.application.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CriarCompradorRequestDTO {

    @NotEmpty
    @Pattern(regexp = "^[A-Za-z]+((\\s)?((\\'|\\-|\\.)?([A-Za-z])+))*$")
    private String nome;

    @NotEmpty
    private String email;

    @NotEmpty
    @Pattern(regexp = "^[0-9]*$")
    private String telefone;

    @NotEmpty
    @Size(max = 11, min = 11)
    @Pattern(regexp = "^[0-9]*$")
    private String cpf;

    @NotEmpty
    private String endereco;
}