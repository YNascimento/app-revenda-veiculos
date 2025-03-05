package com.fiap.yuri.revenda.veiculos.infraestructure.repository.jpa;

import com.fiap.yuri.revenda.veiculos.infraestructure.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaVeiculoRepository extends JpaRepository<VeiculoEntity, Long> {
}
