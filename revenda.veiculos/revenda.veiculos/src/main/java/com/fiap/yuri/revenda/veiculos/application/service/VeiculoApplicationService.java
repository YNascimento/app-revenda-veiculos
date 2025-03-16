package com.fiap.yuri.revenda.veiculos.application.service;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarVeiculoRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VeiculoResponseDTO;

import java.util.List;

public interface VeiculoApplicationService {

    VeiculoResponseDTO cadastrarVeiculo(CriarVeiculoRequestDTO dto);

    VeiculoResponseDTO editarVeiculo(Long id, CriarVeiculoRequestDTO dto) throws Exception;

    List<VeiculoResponseDTO> listarVeiculosDisponiveis();

    List<VeiculoResponseDTO> listarVeiculosVendidos();
}
