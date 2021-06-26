package com.testeVendaThiago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class VendaController {

	@RestController
	@RequestMapping("/vendas")
	public class EntregaController{

		@Autowired 
		private VendaService vendaService;
		
		@GetMapping
		public List<Venda> listarVendas(){
			return vendaaService.listarVendas();
		}
		
		@GetMapping("/{idVenda}")
		public Vendaa findByIdEntrega(@PathVariable Long idVenda) {
			return vendaService.findByIdVenda(idVenda);
		}
		
	}
}
