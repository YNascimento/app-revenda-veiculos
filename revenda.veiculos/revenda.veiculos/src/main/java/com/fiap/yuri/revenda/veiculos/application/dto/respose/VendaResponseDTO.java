package com.fiap.yuri.revenda.veiculos.application.dto.respose;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class VendaResponseDTO {

    private Long id;
    private Long compradorId;
    private Long veiculoId;
    private BigDecimal valorPago;
    private String status;
}