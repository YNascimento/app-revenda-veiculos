package com.fiap.yuri.revenda.veiculos.domain.service.impl.service;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarCompradorRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.CompradorResponseDTO;
import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.repository.CompradorRepository;
import com.fiap.yuri.revenda.veiculos.domain.service.CompradorDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompradorDomainServiceImpl implements CompradorDomainService {

    private CompradorRepository repository;

    public Comprador cadastrarComprador(Comprador comprador) {
        return repository.save(comprador);
    }

    @Override
    public Comprador get(Long idComprador) {
        return repository.findById(idComprador).orElse(null);
    }
}
