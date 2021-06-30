package com.testeVendaThiago.service;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<Vendedor> findByIdVendedor(Long idVendedor){
		return vendedorRepository.findById(idVendedor);
	}
	
	public Vendedor cadastrarVendedor(Vendedor vendedor){
		return vendedorRepository.save(vendedor);
	}
}
