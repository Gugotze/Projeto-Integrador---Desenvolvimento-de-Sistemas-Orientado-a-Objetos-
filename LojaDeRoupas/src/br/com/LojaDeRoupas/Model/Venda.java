/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Model;

import java.util.Date;


public class Venda {
    
    private int codvenda;
    private Date data_venda;
    private int cod_cliente;
    private int cod_produto;
    private int cod_filial;
    private int quantidade;
    private double desconto;
    private double valor_Total;

    public Venda(){
        
    }

    public Venda (int codvenda) {
    	this.codvenda=codvenda;
    }
    
    
    
    public Venda(int codvenda, Date data_venda, int cod_cliente, int cod_produto, int cod_filial, int quantidade,
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

	public void setCodvenda(int codvenda) {
		this.codvenda = codvenda;
	}

	public Date getData_venda() {
		return data_venda;
	}

	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}

	public int getCod_filial() {
		return cod_filial;
	}

	public void setCod_filial(int cod_filial) {
		this.cod_filial = cod_filial;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
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
