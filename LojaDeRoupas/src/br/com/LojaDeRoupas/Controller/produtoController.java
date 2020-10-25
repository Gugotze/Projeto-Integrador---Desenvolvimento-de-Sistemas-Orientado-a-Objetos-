package br.com.LojaDeRoupas.Controller;

import br.com.LojaDeRoupas.Model.produto;

public class produtoController {
	
	public static boolean confirmaProduto(produto produto) {
		String codFilial = produto.get_codFilial() + "";
		
		if(codFilial.trim().equals("")) {
			return false;
		}
		
		return true;
	}

}
