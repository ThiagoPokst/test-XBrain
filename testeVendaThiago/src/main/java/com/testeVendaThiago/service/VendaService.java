package com.testeVendaThiago.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeVendaThiago.model.Venda;
import com.testeVendaThiago.repository.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	public List<Venda> listarVendas(){
		return vendaRepository.findAll();
	}
	
	public Venda findByIdVenda(Long idVenda){
		return vendaRepository.findByIdVenda(idVenda);
	}
	
	public Venda cadastrarVenda(Venda venda){
		return vendaRepository.save(venda);
	}
}
