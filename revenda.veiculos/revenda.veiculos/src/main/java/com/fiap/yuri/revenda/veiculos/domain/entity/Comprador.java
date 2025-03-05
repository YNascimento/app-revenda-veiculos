package com.fiap.yuri.revenda.veiculos.domain.entity;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Comprador {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String endereco;
}
