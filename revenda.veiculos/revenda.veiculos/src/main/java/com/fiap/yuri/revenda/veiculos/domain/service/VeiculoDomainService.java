package com.fiap.yuri.revenda.veiculos.domain.service;

import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;

import java.util.List;

public interface VeiculoDomainService {

    Veiculo cadastrarVeiculo(Veiculo veiculo);

    Veiculo editarVeiculo(Long id, Veiculo veiculo) throws Exception;

    List<Veiculo> listarVeiculosByStatusVeiculo(StatusVeiculo statusVeiculo);

    Veiculo get(Long id);

    Veiculo save(Veiculo veiculo);
}
