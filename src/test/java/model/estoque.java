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

public class estoque {
    
    private int cod_produto;
    private int quantidade;

      
    @Override
    public String toString() {
        return "estoque{" + "cod_produto=" + cod_produto + ", quantidade=" + quantidade + '}';
    }
    
    
    
}
