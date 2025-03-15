package com.fiap.yuri.revenda.veiculos.application.rest;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarCompradorRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.request.EfetuarVendaRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.CompradorResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VendaResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.CompradorApplicationService;
import com.fiap.yuri.revenda.veiculos.application.service.VendaApplicationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compras")
@AllArgsConstructor
public class CompradorController {

    private final CompradorApplicationService compradorApplicationService;

    @PostMapping
//    @PreAuthorize("hasAuthority('COMPRADOR')")
    public ResponseEntity<CompradorResponseDTO> cadastrarComprador(@RequestBody @Valid CriarCompradorRequestDTO dto) throws Exception {
        return ResponseEntity.ok(compradorApplicationService.cadastrarComprador(dto));
    }
}