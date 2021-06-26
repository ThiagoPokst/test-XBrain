package com.testeVendaThiago.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.beans.factory.annotation.Autowired;
//import com.thiago.testeVendaThiago.controller.VendedorService;
@RestController
@RequestMapping("/vendedores")
public class VendedorController {

	//@Autowired
	//private VendedorService vendedorService;
	
	@GetMapping
	public List<Vendedor> listarVendedores(){
		return vendedorService.listarVendedores();
	}
	
	@GetMapping("/{idVendedor}")
	public Vendedor findByIdCliente(@PathVariable Long idVendedor) {
		return vendedorService.findByIdVendedor(idVendedor);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vendedor cadastrarVendedor(@RequestBody Vendedor vendedor){
		return VendedorService.cadastrarVendedor(vendedor);
	}
}
