package com.fiap.yuri.revenda.veiculos.domain.entity;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVenda;
import com.fiap.yuri.revenda.veiculos.infraestructure.entity.VendaEntity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Venda {
    private Long id;
    private Comprador comprador;
    private Veiculo veiculo;
    private BigDecimal valorPago;
    private StatusVenda status;

    public Venda(Comprador comprador, Veiculo veiculo, BigDecimal valorPago, StatusVenda statusVenda) {
        this.comprador = comprador;
        this.veiculo = veiculo;
        this.valorPago = valorPago;
        this.status = statusVenda;
    }

    public Venda(VendaEntity vendaEntity) {
        this.id = vendaEntity.getId();
        this.comprador = new Comprador(vendaEntity.getComprador());
        this.veiculo = new Veiculo((vendaEntity.getVeiculo()));
        this.valorPago = vendaEntity.getValorPago();
        this.status = vendaEntity.getStatus();
    }

    public void confirmarPagamento() {
        this.status = StatusVenda.CONCLUIDA;
        this.veiculo.marcarComoVendido();
    }

    public void cancelarVenda() {
        this.status = StatusVenda.CANCELADA;
        this.veiculo.marcarComoDisponivel();
    }
}
