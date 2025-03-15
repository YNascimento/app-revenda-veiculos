package com.fiap.yuri.revenda.veiculos.domain.entity;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.infraestructure.entity.VeiculoEntity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Veiculo {
    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private BigDecimal preco;
    private StatusVeiculo status;

    public Veiculo(VeiculoEntity veiculoEntity) {
        this.marca = veiculoEntity.getMarca();
        this.modelo = veiculoEntity.getModelo();
        this.ano = veiculoEntity.getAno();
        this.cor = veiculoEntity.getCor();
        this.preco = veiculoEntity.getPreco();
        this.status = veiculoEntity.getStatus();
    }

    public void update(Veiculo updatedVeiculo) {
        this.marca = updatedVeiculo.getMarca();
        this.modelo = updatedVeiculo.getModelo();
        this.ano = updatedVeiculo.getAno();
        this.cor = updatedVeiculo.getCor();
        this.preco = updatedVeiculo.getPreco();
        this.status = updatedVeiculo.getStatus();
    }

    public Veiculo(String marca, String modelo, int ano, String cor, BigDecimal preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.status = StatusVeiculo.DISPONIVEL;
    }

    public void marcarComoVendido() {
        if (this.status != StatusVeiculo.DISPONIVEL) {
            throw new IllegalStateException("Veículo não está disponível para venda.");
        }
        this.status = StatusVeiculo.VENDIDO;
    }
}
