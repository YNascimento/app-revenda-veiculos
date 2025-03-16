package com.fiap.yuri.revenda.veiculos.domain.service;

import com.fiap.yuri.revenda.veiculos.application.dto.request.EfetuarVendaRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VendaResponseDTO;
import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;

import java.math.BigDecimal;

public interface VendaDomainService {

    Venda registrarVendaPendente(Comprador comprador, Veiculo veiculo, BigDecimal valorPago);

    Venda concluirVenda(Venda venda) throws Exception;

    Venda cancelarVenda(Long id) throws Exception;
}
