package com.fiap.yuri.revenda.veiculos.domain.entity;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarCompradorRequestDTO;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.infraestructure.entity.CompradorEntity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Comprador {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String endereco;

    public Comprador(Long id) {
        this.id = id;
    }

    public Comprador(CompradorEntity compradorEntity) {
        this.id = compradorEntity.getId();
        this.nome = compradorEntity.getNome();
        this.email = compradorEntity.getEmail();
        this.telefone = compradorEntity.getTelefone();
        this.cpf = compradorEntity.getCpf();
        this.endereco = compradorEntity.getEndereco();
    }

    public Comprador(CriarCompradorRequestDTO compradorEntity) {
        this.nome = compradorEntity.getNome();
        this.email = compradorEntity.getEmail();
        this.telefone = compradorEntity.getTelefone();
        this.cpf = compradorEntity.getCpf();
        this.endereco = compradorEntity.getEndereco();
    }
}
