/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Model;

import java.util.Date;


public class Venda {
    
    private Integer codvenda;
    private String data_venda;
    private Integer cod_cliente;
    private Integer cod_produto;
    private Integer cod_filial;
    private Integer quantidade;
    private double desconto;
    private double valor_Total;

    public Venda(){
        
    }

    public Venda (Integer codvenda) {
    	this.codvenda=codvenda;
    }

    public Venda(String data_venda, Integer cod_cliente, Integer cod_produto, Integer cod_filial, Integer quantidade, double desconto, double valor_Total) {
        this.data_venda = data_venda;
        this.cod_cliente = cod_cliente;
        this.cod_produto = cod_produto;
        this.cod_filial = cod_filial;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.valor_Total = valor_Total;
    }
    
    
    
    
    public Venda(Integer codvenda, String data_venda, Integer cod_cliente, Integer cod_produto, Integer cod_filial, Integer quantidade,
			double desconto, double valor_Total) {
		
		this.codvenda = codvenda;
		this.data_venda = data_venda;
		this.cod_cliente = cod_cliente;
		this.cod_produto = cod_produto;
		this.cod_filial = cod_filial;
		this.quantidade = quantidade;
		this.desconto = desconto;
		this.valor_Total = valor_Total;
	}

	public int getCodvenda() {
		return codvenda;
	}

	public void setCodvenda(Integer codvenda) {
		this.codvenda = codvenda;
	}

	public String getData_venda() {
		return data_venda;
	}

	public void setData_venda(String data_venda) {
		this.data_venda = data_venda;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(Integer cod_produto) {
		this.cod_produto = cod_produto;
	}

	public int getCod_filial() {
		return cod_filial;
	}

	public void setCod_filial(Integer cod_filial) {
		this.cod_filial = cod_filial;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValor_Total() {
		return valor_Total;
	}

	public void setValor_Total(double valor_Total) {
		this.valor_Total = valor_Total;
	}

	@Override
    public String toString() {
        return "venda{" + "codvenda=" + codvenda + ", data_venda=" + data_venda + ", cod_cliente=" + cod_cliente + ", cod_produto=" + cod_produto + ", cod_filial=" + cod_filial + ", quantidade=" + quantidade + ", desconto=" + desconto + ", valor_Total=" + valor_Total + '}';
    }
      
    
}
