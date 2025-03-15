package com.fiap.yuri.revenda.veiculos.domain.repository;

import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;

import java.util.List;

public interface VeiculoRepository {

    Veiculo save(Veiculo veiculo);

    Veiculo findById(Long id) throws Exception;

    List<Veiculo> findByStatusOrderByPrecoAsc(StatusVeiculo status);
}
