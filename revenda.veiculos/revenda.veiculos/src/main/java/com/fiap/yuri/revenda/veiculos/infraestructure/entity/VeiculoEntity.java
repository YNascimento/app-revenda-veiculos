package com.fiap.yuri.revenda.veiculos.infraestructure.entity;

import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public VeiculoEntity(Long id) {
        this.id = id;
    }

    public VeiculoEntity(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca().toUpperCase();
        this.modelo = veiculo.getModelo().toUpperCase();
        this.ano = veiculo.getAno();
        this.cor = veiculo.getCor();
        this.preco = veiculo.getPreco();
        this.status = veiculo.getStatus();
    }
}
