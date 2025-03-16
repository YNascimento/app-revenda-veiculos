package com.fiap.yuri.revenda.veiculos.domain.repository;

import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;

import java.util.Optional;

public interface VendaRepository {

    Venda save(Venda venda);

    Optional<Venda> findById(Long id);
}
