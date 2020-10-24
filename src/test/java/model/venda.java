/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class venda {
    
    private int codvenda;
    private Date data_venda;
    private int cod_cliente;
    private int cod_produto;
    private int cod_filial;
    private int quantidade;
    private double desconto;
    private double valor_Total;

    public venda(){
        
    }

    @Override
    public String toString() {
        return "venda{" + "codvenda=" + codvenda + ", data_venda=" + data_venda + ", cod_cliente=" + cod_cliente + ", cod_produto=" + cod_produto + ", cod_filial=" + cod_filial + ", quantidade=" + quantidade + ", desconto=" + desconto + ", valor_Total=" + valor_Total + '}';
    }
      
    
}
