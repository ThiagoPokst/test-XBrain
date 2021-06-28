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
	private Long idVenda;
	@Column(name = "dataVenda",nullable = false)
	private String dataVenda;
	@Column(name = "valorVenda",nullable = false)
	private double valorVenda;
	
	public Venda(){	
	}

	public Venda(Long idVenda, String dataVenda, double valorVenda) {
		super();
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
		this.valorVenda = valorVenda;
	}

	public Long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVenda == null) ? 0 : idVenda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (idVenda == null) {
			if (other.idVenda != null)
				return false;
		} else if (!idVenda.equals(other.idVenda))
			return false;
		return true;
	}
	
	
	
}
