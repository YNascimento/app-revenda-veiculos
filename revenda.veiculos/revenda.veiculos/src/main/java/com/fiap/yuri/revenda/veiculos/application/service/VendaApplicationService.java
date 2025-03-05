package com.fiap.yuri.revenda.veiculos.application.service;

import com.fiap.yuri.revenda.veiculos.application.dto.request.EfetuarVendaRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VendaResponseDTO;

public interface VendaApplicationService {

    VendaResponseDTO efetuarVenda(EfetuarVendaRequestDTO dto);
}
