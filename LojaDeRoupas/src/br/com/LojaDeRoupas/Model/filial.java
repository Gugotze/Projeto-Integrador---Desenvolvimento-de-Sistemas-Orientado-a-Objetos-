/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class filial {
    
    private int codfilial;
    private String estado;

    public filial(int codfilial, String estado) {
        this.codfilial = codfilial;
        this.estado = estado;
    }

    
    
    @Override
    public String toString() {
        return "filial{" + "codfilial=" + codfilial + ", estado=" + estado + '}';
    }



	public int getCodfilial() {
		return codfilial;
	}



	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    
    
}
