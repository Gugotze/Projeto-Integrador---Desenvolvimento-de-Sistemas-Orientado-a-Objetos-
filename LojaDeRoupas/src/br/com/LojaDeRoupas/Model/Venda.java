/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Model;

import java.util.Date;


public class Venda {
    
    private Integer id_venda;
    private String data_venda;
    private Integer cod_cliente;
    private Integer cod_produto;
    private Integer cod_filial;
    private Integer quantidade;
    private double desconto;
    private double valor_Total;
	private String tipo;
	private String estado;
	private String nome;
    
    public Venda(Integer id_venda2, String nome, String estado, String tipo, Integer quantidade2, double valor_Total2){
        this.id_venda = id_venda2;
        this.valor_Total = valor_Total2;
        this.quantidade = quantidade2;
        this.nome = nome;
        this.estado = estado;
        this.tipo = tipo;
        
        
    }

    public Venda (Integer id_venda) {
    	this.id_venda=id_venda;
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
    
    
    
    
    public Venda(Integer id_venda, String data_venda, Integer cod_cliente, Integer cod_produto, Integer cod_filial, Integer quantidade,
			double desconto, double valor_Total) {
		
		this.id_venda = id_venda;
		this.data_venda = data_venda;
		this.cod_cliente = cod_cliente;
		this.cod_produto = cod_produto;
		this.cod_filial = cod_filial;
		this.quantidade = quantidade;
		this.desconto = desconto;
		this.valor_Total = valor_Total;
	}

	public Venda() {
		// TODO Auto-generated constructor stub
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(Integer id_venda) {
		this.id_venda = id_venda;
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
        return "venda{" + "id_venda=" + id_venda + ", data_venda=" + data_venda + ", cod_cliente=" + cod_cliente + ", cod_produto=" + cod_produto + ", cod_filial=" + cod_filial + ", quantidade=" + quantidade + ", desconto=" + desconto + ", valor_Total=" + valor_Total + '}';
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
      
    
}
