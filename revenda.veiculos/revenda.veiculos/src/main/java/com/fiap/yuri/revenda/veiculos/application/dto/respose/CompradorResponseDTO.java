package com.fiap.yuri.revenda.veiculos.application.dto.respose;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CompradorResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

    public CompradorResponseDTO(Comprador comprador) {
        this.id = comprador.getId();
        this.nome = comprador.getNome();
        this.email = comprador.getEmail();
        this.telefone = comprador.getTelefone();
    }
}