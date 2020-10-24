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

    
    
    @Override
    public String toString() {
        return "gerente{" + "codgerente=" + codgerente + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", datanascimento=" + datanascimento + ", telefone=" + telefone + ", email=" + email + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro + ", numero=" + numero + ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", login=" + login + ", senha=" + senha + '}';
    }
  
    
    
    
}
