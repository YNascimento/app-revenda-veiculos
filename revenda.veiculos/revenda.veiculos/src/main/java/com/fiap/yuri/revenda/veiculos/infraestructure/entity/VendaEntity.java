package com.fiap.yuri.revenda.veiculos.infraestructure.entity;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVenda;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "vendas")
public class VendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CompradorEntity comprador;

    @ManyToOne
    private VeiculoEntity veiculo;

    private BigDecimal valorPago;

    @Enumerated(EnumType.STRING)
    private StatusVenda status;
}
