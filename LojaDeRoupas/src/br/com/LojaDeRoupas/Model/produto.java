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

    @Override
    public String toString() {
        return "produto{" + "_codFilial=" + _codFilial + ", _codProduto=" + _codProduto + ", _nome=" + _nome + ", _tipo=" + _tipo + ", _quantidade=" + _quantidade + ", _valorCompra=" + _valorCompra + ", _valorVenda=" + _valorVenda + '}';
    }

  
    
  
    
    
    
}
