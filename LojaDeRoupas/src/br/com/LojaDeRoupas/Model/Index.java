package br.com.LojaDeRoupas.Model;

public class Index {
		
	private String _data;
	private int _qtd;
	private int _qtdProdutos;
	private int _qtdClientes;
	private int _qtdVenda;
	
	public Index(String data, int qtd) {
		this._data = data;
		this._qtd = qtd;	
	}

	public String get_data() {
		return _data;
	}

	public void set_data(String _data) {
		this._data = _data;
	}

	public int get_qtd() {
		return _qtd;
	}

	public void set_qtd(int _qtd) {
		this._qtd = _qtd;
	}

	public int get_qtdProdutos() {
		return _qtdProdutos;
	}

	public void set_qtdProdutos(int _qtdProdutos) {
		this._qtdProdutos = _qtdProdutos;
	}

	public int get_qtdClientes() {
		return _qtdClientes;
	}

	public void set_qtdClientes(int _qtdClientes) {
		this._qtdClientes = _qtdClientes;
	}

	public int get_qtdVenda() {
		return _qtdVenda;
	}

	public void set_qtdVenda(int _qtdVenda) {
		this._qtdVenda = _qtdVenda;
	}
	
	
	
	
}
