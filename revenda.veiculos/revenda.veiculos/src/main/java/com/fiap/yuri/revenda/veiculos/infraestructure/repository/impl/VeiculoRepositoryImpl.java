package com.fiap.yuri.revenda.veiculos.infraestructure.repository.impl;

import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.domain.repository.VeiculoRepository;
import com.fiap.yuri.revenda.veiculos.infraestructure.entity.VeiculoEntity;
import com.fiap.yuri.revenda.veiculos.infraestructure.repository.jpa.JpaVeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class VeiculoRepositoryImpl implements VeiculoRepository {

    private final JpaVeiculoRepository jpaRepository;

    @Override
    public Veiculo save(Veiculo veiculo) {
        VeiculoEntity veiculoEntity = new VeiculoEntity(veiculo);
        veiculoEntity = jpaRepository.save(veiculoEntity);
        veiculo.setId(veiculoEntity.getId());
        return veiculo;
    }

    @Override
    public Veiculo findById(Long id) throws Exception {
        Optional<VeiculoEntity> optVeiculoEntity = jpaRepository.findById(id);
        VeiculoEntity veiculoEntity = optVeiculoEntity.orElseThrow(() -> new Exception("Veículo não encontrado"));
        return new Veiculo(veiculoEntity);
    }

    @Override
    public List<Veiculo> findByStatusOrderByPrecoAsc(StatusVeiculo status) {
        List<VeiculoEntity> veiculoEntitiesbyStatusOrderByPrecoAsc = jpaRepository.findByStatusOrderByPrecoAsc(status);
        return veiculoEntitiesbyStatusOrderByPrecoAsc.stream()
                .map(entity -> new Veiculo(entity))
                .collect(Collectors.toList());
    }
}
