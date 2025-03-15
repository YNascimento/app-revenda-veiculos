package com.fiap.yuri.revenda.veiculos.application.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EfetuarVendaRequestDTO {

    private Long compradorId;
    private Long veiculoId;
    private BigDecimal valorPago;

}