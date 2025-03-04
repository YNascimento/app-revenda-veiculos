package com.fiap.yuri.revenda.veiculos.application.dto.request;

import lombok.Data;

@Data
public class EfeturarVendaRequestDTO {
    private Long compradorId;
    private Long veiculoId;
}