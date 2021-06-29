package com.testeVendaThiago.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeVendaThiago.model.Vendedor;
import com.testeVendaThiago.repository.VendedorRepository;

@Service
public class VendedorService {
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	public List<Vendedor> listarVendedores(){
		return vendedorRepository.findAll();
	}
	
	public Vendedor findByIdVendedor(Long idVendedor){
		return vendedorRepository.findByIdVendedor(idVendedor);
	}
	
	public Vendedor cadastrarVendedor(Vendedor vendedor){
		return vendedorRepository.save(vendedor);
	}
}
