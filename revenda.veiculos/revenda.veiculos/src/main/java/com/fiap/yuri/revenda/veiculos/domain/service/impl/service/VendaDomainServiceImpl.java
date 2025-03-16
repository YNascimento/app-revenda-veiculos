package com.fiap.yuri.revenda.veiculos.domain.service.impl.service;

import com.fiap.yuri.revenda.veiculos.domain.entity.Comprador;
import com.fiap.yuri.revenda.veiculos.domain.entity.Veiculo;
import com.fiap.yuri.revenda.veiculos.domain.entity.Venda;
import com.fiap.yuri.revenda.veiculos.domain.enums.StatusVenda;
import com.fiap.yuri.revenda.veiculos.domain.repository.VendaRepository;
import com.fiap.yuri.revenda.veiculos.domain.service.VendaDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@AllArgsConstructor
@Service
public class VendaDomainServiceImpl implements VendaDomainService {

    private VendaRepository repository;

    public Venda registrarVendaPendente(Comprador comprador, Veiculo veiculo, BigDecimal valorPago) {
        Venda venda = new Venda(comprador, veiculo, valorPago, StatusVenda.PENDENTE);
        return repository.save(venda);
    }

    @Override
    public Venda concluirVenda(Venda venda) throws Exception {
        repository.findById(venda.getId())
                .orElseThrow(() -> new Exception("Registro de Venda não encontrada"));
        venda.confirmarPagamento();
        return repository.save(venda);
    }

    @Override
    public Venda cancelarVenda(Long id) throws Exception {
        Venda venda = repository.findById(id)
                .orElseThrow(() -> new Exception("Registro de Venda não encontrada"));
        venda.cancelarVenda();
        return repository.save(venda);
    }
}
