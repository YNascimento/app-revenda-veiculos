package com.fiap.yuri.revenda.veiculos.domain.service;

import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;

import java.util.List;

public interface VeiculoDomainService {

    Veiculo cadastrarVeiculo(Veiculo veiculo);

    Veiculo editarVeiculo(Long id, Veiculo veiculo);

    List<Veiculo> listarVeiculosDisponiveis();

    List<Veiculo> listarVeiculosVendidos();
}
