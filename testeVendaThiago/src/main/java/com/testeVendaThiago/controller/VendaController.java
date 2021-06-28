package com.testeVendaThiago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class VendaController{

	@Autowired 
	private VendaService vendaService;
		
	@GetMapping
	public List<Venda> listarVendas(){
		return vendaService.listarVendas();
	}
		
	@GetMapping("/{idVenda}")
		public Venda findByIdVenda(@PathVariable Long idVenda) {
		return vendaService.findByIdVenda(idVenda);
	}
		
}
