package br.com.LojaDeRoupas.Model;


public class Cliente {
	
	
	private String nomeCliente;
	private String cpfCliente;
	private String sexoCliente;
	private String dataNascimento;
	private int telefone;
	private String email;
	private String cep;
	private String endereco;
	private String bairro;
	private int numero;
	private String complemento;
	private String cidade;
	private String estado;
	
	
	
	public Cliente( String nomeCliente, String cpfCliente, String sexoCliente, String dataNascimento,
			int telefone, String email, String cep, String endereco, String bairro, int numero,
			String complemento, String cidade, String estado) {

		
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.sexoCliente = sexoCliente;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.cep = cep;
		this.endereco = endereco;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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







	
	
	
	
	

}
