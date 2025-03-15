package com.fiap.yuri.revenda.veiculos.infraestructure.entity;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVenda;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
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

    public VendaEntity(Venda venda) {
        this.comprador = new CompradorEntity(venda.getComprador().getId());
        this.veiculo = new VeiculoEntity(venda.getVeiculo().getId());
        this.valorPago = venda.getValorPago();
        this.status = StatusVenda.CONCLUIDA;
    }
}
