package com.fiap.yuri.revenda.veiculos.infraestructure.repository.impl;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.repository.CompradorRepository;
import com.fiap.yuri.revenda.veiculos.infraestructure.entity.CompradorEntity;
import com.fiap.yuri.revenda.veiculos.infraestructure.repository.jpa.JpaCompradorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CompradorRepositoryImpl implements CompradorRepository {

    private final JpaCompradorRepository jpaRepository;

    @Override
    public Comprador save(Comprador comprador) {
        CompradorEntity compradorEntity = new CompradorEntity(comprador);
        jpaRepository.save(compradorEntity);
        comprador.setId(compradorEntity.getId());
        return comprador;
    }

    @Override
    public Optional<Comprador> findById(Long id) {
        Optional<CompradorEntity> optCompradorEntity = jpaRepository.findById(id);
        return optCompradorEntity.isPresent() ? Optional.of(new Comprador(optCompradorEntity.get())) : Optional.empty();
    }
}
