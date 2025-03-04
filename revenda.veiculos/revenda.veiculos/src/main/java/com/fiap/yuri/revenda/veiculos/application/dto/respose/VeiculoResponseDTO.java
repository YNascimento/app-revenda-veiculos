package com.fiap.yuri.revenda.veiculos.application.dto.respose;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VeiculoResponseDTO {

    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private BigDecimal preco;
    private String status;
}