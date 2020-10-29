package br.com.LojaDeRoupas.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class venda_has_produto {
    
    private int cod_venda;
    private int cod_cliente;
    private int cod_produto;
    private int cod_filial;

    @Override
    public String toString() {
        return "venda_has_produto{" + "cod_venda=" + cod_venda + ", cod_cliente=" + cod_cliente + ", cod_produto=" + cod_produto + ", cod_filial=" + cod_filial + '}';
    }

	public int getCod_venda() {
		return cod_venda;
	}

	public void setCod_venda(int cod_venda) {
		this.cod_venda = cod_venda;
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
   

    
}
