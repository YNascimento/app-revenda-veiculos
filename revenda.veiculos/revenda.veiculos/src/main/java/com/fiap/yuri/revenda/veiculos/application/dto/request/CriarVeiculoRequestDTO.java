package com.fiap.yuri.revenda.veiculos.application.dto.request;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CriarVeiculoRequestDTO {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private BigDecimal preco;
    private StatusVeiculo status;
}