package com.fiap.yuri.revenda.veiculos.application.rest;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarCompradorRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.CompradorResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.CompradorApplicationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compras")
@AllArgsConstructor
public class CompradorController {

    private final CompradorApplicationService compradorApplicationService;

    @PostMapping(consumes = "application/json", produces = "application/json")
//    @PreAuthorize("hasAuthority('COMPRADOR')")
    public ResponseEntity<CompradorResponseDTO> cadastrarComprador(@RequestBody @Valid CriarCompradorRequestDTO dto) throws Exception {
        CompradorResponseDTO response = compradorApplicationService.cadastrarComprador(dto);
        return ResponseEntity.ok(response);
    }
}