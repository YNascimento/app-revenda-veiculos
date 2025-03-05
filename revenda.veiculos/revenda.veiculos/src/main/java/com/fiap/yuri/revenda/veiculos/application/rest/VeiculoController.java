package com.fiap.yuri.revenda.veiculos.application.rest;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarVeiculoRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VeiculoResponseDTO;
import com.fiap.yuri.revenda.veiculos.application.service.VeiculoApplicationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
@AllArgsConstructor
public class VeiculoController {

    private final VeiculoApplicationService veiculoService;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<VeiculoResponseDTO> cadastrarVeiculo(@RequestBody @Valid CriarVeiculoRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculoService.cadastrarVeiculo(dto));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<VeiculoResponseDTO> editarVeiculo(@PathVariable Long id, @RequestBody @Valid CriarVeiculoRequestDTO dto) {
        return ResponseEntity.ok(veiculoService.editarVeiculo(id, dto));
    }

    @GetMapping("/disponiveis")
    public ResponseEntity<List<VeiculoResponseDTO>> listarVeiculosDisponiveis() {
        return ResponseEntity.ok(veiculoService.listarVeiculosDisponiveis());
    }

    @GetMapping("/vendidos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<List<VeiculoResponseDTO>> listarVeiculosVendidos() {
        return ResponseEntity.ok(veiculoService.listarVeiculosVendidos());
    }
}
