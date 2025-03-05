package com.fiap.yuri.revenda.veiculos.domain.entity;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVenda;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Venda {
    private Long id;
    private Comprador comprador;
    private Veiculo veiculo;
    private BigDecimal valorPago;
    private StatusVenda status;

    public Venda(Comprador comprador, Veiculo veiculo, BigDecimal valorPago) {
        this.comprador = comprador;
        this.veiculo = veiculo;
        this.valorPago = valorPago;
        this.status = StatusVenda.PENDENTE;
    }

    public void confirmarPagamento() {
        this.status = StatusVenda.CONCLUIDA;
        this.veiculo.marcarComoVendido();
    }
}
