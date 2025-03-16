package com.fiap.yuri.revenda.veiculos.infraestructure.entity;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Entity
@Table(name = "compradores")
public class CompradorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String endereco;

    public CompradorEntity(Long id){
        this.id = id;
    }

    public CompradorEntity(Comprador comprador) {
        this.nome = comprador.getNome();
        this.email = comprador.getEmail();
        this.telefone = comprador.getTelefone();
        this.cpf = comprador.getCpf();
        this.endereco = comprador.getEndereco();
    }
}
