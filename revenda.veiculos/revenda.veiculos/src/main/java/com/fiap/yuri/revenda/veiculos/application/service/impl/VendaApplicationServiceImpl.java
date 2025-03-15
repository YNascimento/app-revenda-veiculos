package com.fiap.yuri.revenda.veiculos.application.service.impl;

import com.fiap.yuri.revenda.veiculos.application.dto.request.EfetuarVendaRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VendaResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.VendaApplicationService;
import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;
import com.fiap.yuri.revenda.veiculos.domain.service.CompradorDomainService;
import com.fiap.yuri.revenda.veiculos.domain.service.VeiculoDomainService;
import com.fiap.yuri.revenda.veiculos.domain.service.VendaDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@AllArgsConstructor
@Service
public class VendaApplicationServiceImpl implements VendaApplicationService {

    private CompradorDomainService compradorDomainService;
    private VeiculoDomainService veiculoDomainService;
    private VendaDomainService vendaDomainService;

    public VendaResponseDTO efetuarVenda(EfetuarVendaRequestDTO dto) throws Exception {
        /*
         * Valida comprador
         * Valida carro não vendido
         * Salvar carro como vendido
         * Salvar venda
         */

        Venda venda = vendaDomainService.registrarVendaPendente(
                new Comprador(dto.getCompradorId()), new Veiculo(dto.getVeiculoId()), dto.getValorPago());

        Comprador comprador = compradorDomainService.get(dto.getCompradorId());
        if(Objects.isNull(comprador)){
            throw new RuntimeException(String.format("Comprador com Id %s é invalido", dto.getCompradorId().toString()));
        }

        Veiculo veiculo = veiculoDomainService.get(dto.getVeiculoId());
        if(Objects.isNull(veiculo) || !veiculo.isVendidoDisponivel()){
            throw new RuntimeException("Veículo não está disponível para venda");
        }

        venda = vendaDomainService.concluirVenda(venda.getId());
        return new VendaResponseDTO(venda.getId(), comprador.getId(), veiculo.getId(),
                venda.getValorPago(), venda.getStatus().name());
    }
}