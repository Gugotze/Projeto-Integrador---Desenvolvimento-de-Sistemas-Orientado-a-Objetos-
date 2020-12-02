package br.com.LojaDeRoupas.Model;

public class Carrinho {
	
	private int _id;
	private String _nome;
	private double _preco;
	private int _qtd;
	
	
	public Carrinho(int _id, String _nome, double _preco, int _qtd) {
		this._id = _id;
		this._nome = _nome;
		this._preco = _preco;
		this._qtd = _qtd;
	}


	public int get_id() {
		return _id;
	}


	public void set_id(int _id) {
		this._id = _id;
	}


	public String get_nome() {
		return _nome;
	}


	public void set_nome(String _nome) {
		this._nome = _nome;
	}


	public double get_preco() {
		return _preco;
	}


	public void set_preco(double _preco) {
		this._preco = _preco;
	}


	public int get_qtd() {
		return _qtd;
	}


	public void set_qtd(int _qtd) {
		this._qtd = _qtd;
	}
	
	
	
	
}	
