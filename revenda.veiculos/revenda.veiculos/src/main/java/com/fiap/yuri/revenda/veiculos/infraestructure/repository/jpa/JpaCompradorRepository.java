package com.fiap.yuri.revenda.veiculos.infraestructure.repository.jpa;

import com.fiap.yuri.revenda.veiculos.infraestructure.entity.CompradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCompradorRepository extends JpaRepository<CompradorEntity, Long> {
}
