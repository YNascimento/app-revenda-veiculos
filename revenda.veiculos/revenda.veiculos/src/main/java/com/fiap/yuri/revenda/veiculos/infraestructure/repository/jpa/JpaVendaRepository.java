package com.fiap.yuri.revenda.veiculos.infraestructure.repository.jpa;

import com.fiap.yuri.revenda.veiculos.infraestructure.entity.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaVendaRepository extends JpaRepository<VendaEntity, Long> {
}
