package com.fiap.yuri.revenda.veiculos.application.dto.respose;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CompradorResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
}