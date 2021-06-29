package com.testeVendaThiago.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeVendaThiago.model.Venda;
import com.testeVendaThiago.model.Vendedor;
import com.testeVendaThiago.repository.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private VendedorService vendedorService;
	
	public List<Venda> listarVendas(){
		return vendaRepository.findAll();
	}
	
	public Venda findByIdVenda(Long idVenda){
		return vendaRepository.findByIdVenda(idVenda);
	}
	
	public Vendedor findVendedorById(Long id) {
		return vendedorService.findByIdVendedor(id);
	}
	
	public Venda cadastrarVenda(Venda venda){
		//venda.setNomeVendedor(findVendedorById(venda.getIdVenda()).getNomeVendedor());
		Vendedor vendedor = new Vendedor();
		vendedor = findVendedorById(venda.getIdVenda());
		venda.setNomeVendedor(vendedor.getNomeVendedor());
		return vendaRepository.save(venda);
	}

	 public List<Object[]> byParams(Date dataInicial, Date dataFinal){
		 return (vendaRepository.byParams(dataInicial,dataFinal));

	    }
}
