package com.fiap.yuri.revenda.veiculos.infraestructure.entity;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "veiculos")
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private BigDecimal preco;

    @Enumerated(EnumType.STRING)
    private StatusVeiculo status;
}
