package com.testeVendaThiago.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Date dataVenda;
	@NotNull
	@Column(name = "valorVenda")
	private double valorVenda;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "vendedorVenda")
	private Vendedor idVendedor;
	@NotNull
	private String nomeVendedor;
	
	public Venda(){	
	}

	

	public Venda(Long idVenda, Date dataVenda, double valorVenda, Vendedor idVendedor, String nomeVendedor) {
		super();
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
		this.valorVenda = valorVenda;
		this.idVendedor = idVendedor;
		this.nomeVendedor = nomeVendedor;
	}

	public Long getIdVenda() {
		return idVenda;
	}


	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}


	public Date getDataVenda() {
		return dataVenda;
	}


	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}


	public double getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}


	public Vendedor getIdVendedor() {
		return idVendedor;
	}


	public void setIdVendedor(Vendedor idVendedor) {
		this.idVendedor = idVendedor;
	}


	public String getNomeVendedor() {
		return nomeVendedor;
	}


	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
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
