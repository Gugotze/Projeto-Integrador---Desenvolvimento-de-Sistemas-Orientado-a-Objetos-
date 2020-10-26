package br.com.LojaDeRoupas.Model;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class produto {
    
    private int _codFilial;
    private int _codProduto;
    private String _nome;
    private String _tipo;
    private int _quantidade;
    private double _valorCompra;
    private double _valorVenda;
    
    public produto() {	
	}
    
    public produto(int codFilial, int codProduto, String nome, String tipo, int quantidade, double valorCompra, double valorVenda) {
    	this._codFilial = codFilial;
    	this._codProduto = codProduto;
    	this._nome = nome;
    	this._tipo = tipo;
    	this._quantidade = quantidade;
    	this._valorCompra = valorCompra;
    	this._valorVenda = valorVenda;
    }
    
    

    @Override
    public String toString() {
        return "produto{" + "_codFilial=" + _codFilial + ", _codProduto=" + _codProduto + ", _nome=" + _nome + ", _tipo=" + _tipo + ", _quantidade=" + _quantidade + ", _valorCompra=" + _valorCompra + ", _valorVenda=" + _valorVenda + '}';
    }

  
    
  
    
    
    
}
