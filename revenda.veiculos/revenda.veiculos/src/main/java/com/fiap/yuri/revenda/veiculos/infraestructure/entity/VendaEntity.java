package com.fiap.yuri.revenda.veiculos.infraestructure.entity;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVenda;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vendas")
public class VendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "comprador_id")
    private CompradorEntity comprador;

    @OneToOne
    @JoinColumn(name = "veiculo_id")
    private VeiculoEntity veiculo;

    private BigDecimal valorPago;

    @Enumerated(EnumType.STRING)
    private StatusVenda status;

    public VendaEntity(Venda venda) {
        this.id = venda.getId();
        this.comprador = new CompradorEntity(venda.getComprador().getId());
        this.veiculo = new VeiculoEntity(venda.getVeiculo().getId());
        this.valorPago = venda.getValorPago();
        this.status = StatusVenda.CONCLUIDA;
    }
}
