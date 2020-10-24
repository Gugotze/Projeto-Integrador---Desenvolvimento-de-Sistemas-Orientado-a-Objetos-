/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Model;

import java.util.Date;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter

public class gerente extends funcionario {
    
    

    public gerente(int codgerente, String nome, String cpf, String sexo, Date datanascimento, int telefone, String email, String cep, String endereco, String bairro, int numero, String cidade, String estado, String login, String senha) {
        super(codgerente,nome,cpf,sexo,datanascimento,telefone, email,cep,endereco,bairro,numero,cidade,estado,login,senha);
    }

    
    
    
    @Override
	public boolean Logar(String user, String password) {
    	
    	return user.equals(login) && user.equals(senha);
	
	}
    
    @Override
    public String toString() {
        return super.toString();
    }



	
  
    
    
    
}
