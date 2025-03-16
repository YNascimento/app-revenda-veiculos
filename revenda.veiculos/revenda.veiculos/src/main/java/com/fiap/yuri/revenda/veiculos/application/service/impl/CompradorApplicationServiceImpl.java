package com.fiap.yuri.revenda.veiculos.application.service.impl;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarCompradorRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.CompradorResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.CompradorApplicationService;
import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.repository.CompradorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompradorApplicationServiceImpl implements CompradorApplicationService {

    private CompradorRepository repository;

    public CompradorResponseDTO cadastrarComprador(CriarCompradorRequestDTO dto) {
        Comprador comprador = new Comprador(dto);
        Comprador savedComprador = repository.save(comprador);
        return new CompradorResponseDTO(savedComprador);
    }
}
