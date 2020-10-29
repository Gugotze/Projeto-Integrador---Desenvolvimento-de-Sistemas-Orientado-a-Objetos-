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

public abstract class funcionario {
    
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
    protected String login;
    protected String senha;

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


    public abstract boolean Logar(String user, String password);
    
       
    @Override
    public String toString() {
        return "funcionario{" + "codfuncionario=" + codfuncionario + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", datanascimento=" + datanascimento + ", telefone=" + telefone + ", email=" + email + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro + ", numero=" + numero + ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", login=" + login + ", senha=" + senha + '}';
    }


	public int getCodfuncionario() {
		return codfuncionario;
	}


	public void setCodfuncionario(int codfuncionario) {
		this.codfuncionario = codfuncionario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Date getDatanascimento() {
		return datanascimento;
	}


	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
    
    
    
    
}
