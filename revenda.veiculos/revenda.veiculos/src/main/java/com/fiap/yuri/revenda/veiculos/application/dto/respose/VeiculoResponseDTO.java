package com.fiap.yuri.revenda.veiculos.application.dto.respose;

import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.service.VeiculoDomainService;
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

    public VeiculoResponseDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.preco = veiculo.getPreco();
        this.status = veiculo.getStatus().name();
    }
}