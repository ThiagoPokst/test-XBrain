package com.testeVendaThiago.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Venda")
public class Venda {
	@Id
	@NotNull
	@Column(name = "vendaId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenda;
	@NotNull
	@Column(name = "dataVenda")
	private LocalDateTime dataVenda;
	@NotNull
	@Column(name = "valorVenda")
	private double valorVenda;
	
	public Venda(){	
	}

	public Venda(Long idVenda, LocalDateTime dataVenda, double valorVenda) {
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

	public LocalDateTime getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDateTime dataVenda) {
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
