package com.fiap.yuri.revenda.veiculos.infraestructure.repository.jpa;

import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.infraestructure.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaVeiculoRepository extends JpaRepository<VeiculoEntity, Long> {

    List<VeiculoEntity> findByStatusOrderByPrecoAsc(StatusVeiculo status);
}
