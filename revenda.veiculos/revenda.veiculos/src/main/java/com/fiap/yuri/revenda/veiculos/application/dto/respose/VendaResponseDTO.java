package com.fiap.yuri.revenda.veiculos.application.dto.respose;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VendaResponseDTO {

    private Long id;
    private Long compradorId;
    private Long veiculoId;
    private BigDecimal valorPago;
    private String status;
}