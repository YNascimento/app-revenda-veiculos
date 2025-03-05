package com.fiap.yuri.revenda.veiculos.application.service.impl;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarVeiculoRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VeiculoResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.VeiculoApplicationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoApplicationServiceImpl implements VeiculoApplicationService {

    public VeiculoResponseDTO cadastrarVeiculo(CriarVeiculoRequestDTO dto){
        return null;
    }

    public VeiculoResponseDTO editarVeiculo(Long id, CriarVeiculoRequestDTO dto) {
        return null;
    }

    public List<VeiculoResponseDTO> listarVeiculosDisponiveis() {
        return null;
    }

    public List<VeiculoResponseDTO> listarVeiculosVendidos() {
        return null;
    }
}