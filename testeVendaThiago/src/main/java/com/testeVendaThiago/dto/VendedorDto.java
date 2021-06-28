package com.testeVendaThiago.dto;

import com.testeVendaThiago.model.Vendedor;

public class VendedorDto {
	private String nome;
	private Integer qtdTotalVendas;
	private double mediaDiaria;
	
	public VendedorDto() {
	}
	
	public VendedorDto criarDto(Vendedor vendedor){
		VendedorDto vendedorDto = new VendedorDto();
		vendedorDto.nome = vendedor.getNomeVendedor();
		//vendedorDto.qtdTotalVendas = 
		//vendedorDto.mediaDiaria = 
		return vendedorDto;
	}
}
