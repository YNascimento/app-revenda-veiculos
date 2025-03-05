package com.fiap.yuri.revenda.veiculos.domain.service;

import com.fiap.yuri.revenda.veiculos.application.dto.request.EfetuarVendaRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VendaResponseDTO;
import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;

public interface VendaDomainService {

    Venda efetuarVenda(Long compradorId, Long veiculoId);
}
