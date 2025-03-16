package com.fiap.yuri.revenda.veiculos.application.service.impl;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarVeiculoRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VeiculoResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.VeiculoApplicationService;
import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.domain.service.VeiculoDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class VeiculoApplicationServiceImpl implements VeiculoApplicationService {

    private VeiculoDomainService veiculoDomainService;

    public VeiculoResponseDTO cadastrarVeiculo(CriarVeiculoRequestDTO dto){
        Veiculo veiculo = new Veiculo(dto.getMarca(), dto.getModelo(), dto.getAno(), dto.getCor(), dto.getPreco(), StatusVeiculo.DISPONIVEL);
        veiculoDomainService.cadastrarVeiculo(veiculo);
        return new VeiculoResponseDTO(veiculo);
    }

    public VeiculoResponseDTO editarVeiculo(Long id, CriarVeiculoRequestDTO dto) throws Exception {
        Veiculo updateVeiculo = new Veiculo(dto.getMarca(), dto.getModelo(), dto.getAno(), dto.getCor(), dto.getPreco(), dto.getStatus());
        Veiculo veiculo = veiculoDomainService.editarVeiculo(id, updateVeiculo);
        return new VeiculoResponseDTO(veiculo);
    }

    public List<VeiculoResponseDTO> listarVeiculosDisponiveis() {
        return veiculoDomainService.listarVeiculosByStatusVeiculo(StatusVeiculo.DISPONIVEL)
                .stream()
                .map(VeiculoResponseDTO::new)
                .collect(Collectors.toList());
    }

    public List<VeiculoResponseDTO> listarVeiculosVendidos() {
        return veiculoDomainService.listarVeiculosByStatusVeiculo(StatusVeiculo.VENDIDO)
                .stream()
                .map(VeiculoResponseDTO::new)
                .collect(Collectors.toList());
    }
}