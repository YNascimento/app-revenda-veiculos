package com.fiap.yuri.revenda.veiculos.application.rest;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarVeiculoRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.request.EfetuarVendaRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VeiculoResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VendaResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.VeiculoApplicationService;
import com.fiap.yuri.revenda.veiculos.application.service.VendaApplicationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendas")
@AllArgsConstructor
public class VendaController {

    private final VendaApplicationService vendaApplicationService;

    @PostMapping
//    @PreAuthorize("hasAuthority('COMPRADOR')")
    public ResponseEntity<VendaResponseDTO> efetuarVenda(@RequestBody @Valid EfetuarVendaRequestDTO dto) throws Exception {
        return ResponseEntity.ok(vendaApplicationService.efetuarVenda(dto));
    }
}