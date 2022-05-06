package com.mjv.mercado;

import java.time.LocalDate;

public class CarrinhoCompra {
	protected String id;
	protected LocalDate dataCompra;
	protected Double valorCompra;
	protected Integer qtdProduto;
	protected Double valorItem;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public Integer getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(Integer qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public Double getValorItem() {
		return valorItem;
	}
	public void setValorItem(Double valorItem) {
		this.valorItem = valorItem;
	}
	
	
}
