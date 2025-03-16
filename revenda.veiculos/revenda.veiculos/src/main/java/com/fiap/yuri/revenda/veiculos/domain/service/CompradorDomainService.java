package com.fiap.yuri.revenda.veiculos.domain.service;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;

public interface CompradorDomainService {

    Comprador cadastrarComprador(Comprador comprador);

    Comprador get(Long id);
}
