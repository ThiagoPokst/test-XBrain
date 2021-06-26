package com.testeVendaThiago.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Venda")
public class Venda {
	@Id
	@Column(name = "vendaId")
	@GeneratedValue(strategy = GenerationType.IDENTITY) //
	private value idVenda;
	@Column(name = "dataVenda",nullable = false)
	private value dataVenda;
	@Column(name = "valorVenda",nullable = false)
	private value valorVenda;
}
