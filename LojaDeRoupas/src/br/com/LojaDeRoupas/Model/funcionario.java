/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Model;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;
        
@Getter
@Setter

public class funcionario {
    
    private int codfuncionario;
    private String nome;
    private String cpf;
    private String sexo;
    private Date datanascimento;
    private int telefone;
    private String email;
    private String cep;
    private String endereco;
    private String bairro;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String login;
    private String senha;

    public funcionario(int codfuncionario, String nome, String cpf, String sexo, Date datanascimento, int telefone, String email, String cep, String endereco, String bairro, int numero, String cidade, String estado, String login, String senha) {
        this.codfuncionario = codfuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.login = login;
        this.senha = senha;
    }

       
    @Override
    public String toString() {
        return "funcionario{" + "codfuncionario=" + codfuncionario + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", datanascimento=" + datanascimento + ", telefone=" + telefone + ", email=" + email + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro + ", numero=" + numero + ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", login=" + login + ", senha=" + senha + '}';
    }
    
    
    
    
}
