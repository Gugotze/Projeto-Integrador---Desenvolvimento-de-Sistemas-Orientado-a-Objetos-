/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
   

    
}
