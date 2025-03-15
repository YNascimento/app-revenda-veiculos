package com.fiap.yuri.revenda.veiculos.domain.service.impl.service;

import com.fiap.yuri.revenda.veiculos.application.dto.request.CriarVeiculoRequestDTO;
import com.fiap.yuri.revenda.veiculos.application.dto.respose.VeiculoResponseDTO;
import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVeiculo;
import com.fiap.yuri.revenda.veiculos.domain.repository.VeiculoRepository;
import com.fiap.yuri.revenda.veiculos.domain.service.VeiculoDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VeiculoDomainServiceImpl implements VeiculoDomainService {

    private VeiculoRepository repository;

    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public Veiculo editarVeiculo(Long id, Veiculo updatedVeiculo) throws Exception {
        Veiculo veiculo = repository.findById(id);
        veiculo.update(updatedVeiculo);
        return repository.save(veiculo);
    }

    public List<Veiculo> listarVeiculosByStatusVeiculo(StatusVeiculo statusVeiculo) {
        return repository.findByStatusOrderByPrecoAsc(statusVeiculo);
    }

    @Override
    public Veiculo get(Long id) {
        try {
            return repository.findById(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Veiculo save(Veiculo veiculo) {
        return repository.save(veiculo);
    }
}
