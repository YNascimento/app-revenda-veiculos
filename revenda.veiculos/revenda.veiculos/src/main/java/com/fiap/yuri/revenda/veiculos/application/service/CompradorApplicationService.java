package com.fiap.yuri.revenda.veiculos.application.service;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarCompradorRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.CompradorResponseDTO;

public interface CompradorApplicationService {

    CompradorResponseDTO cadastrarComprador(CriarCompradorRequestDTO dto);
}
