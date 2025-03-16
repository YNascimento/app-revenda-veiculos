package com.fiap.yuri.revenda.veiculos.infraestructure.repository.impl;

import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;
import com.fiap.yuri.revenda.veiculos.domain.repository.VendaRepository;
import com.fiap.yuri.revenda.veiculos.infraestructure.entity.VendaEntity;
import com.fiap.yuri.revenda.veiculos.infraestructure.repository.jpa.JpaVendaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class VendaRepositoryImpl implements VendaRepository {

    private JpaVendaRepository jpaRepository;

    @Override
    public Venda save(Venda venda) {
        VendaEntity vendaEntity = new VendaEntity(venda);
        jpaRepository.save(vendaEntity);
        venda.setId(vendaEntity.getId());
        return venda;
    }

    @Override
    public Optional<Venda> findById(Long id) {
        Optional<VendaEntity> optVendaEntity = jpaRepository.findById(id);
        return optVendaEntity.isPresent() ? Optional.of(new Venda(optVendaEntity.get())) : Optional.empty();
    }
}
