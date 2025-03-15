package com.fiap.yuri.revenda.veiculos.domain.repository;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;

import java.util.Optional;

public interface CompradorRepository {

    Comprador save(Comprador comprador);
    Optional<Comprador> findById(Long id);
}
