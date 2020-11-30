package br.com.LojaDeRoupas.Model;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Usuario {
		
	private String _usuario;
	private String _senha;
	
	public String get_usuario() {
		return _usuario;
	}
	
	
	public void set_usuario(String _usuario) {
		this._usuario = _usuario;
	}
	
	public String get_senha() {
		return _senha;
	}
	
	public void set_senha(String _senha) {
		this._senha = _senha;
	}
	
	public static boolean estaLogado(HttpServletRequest request, HttpServletResponse response) {
		HttpSession sessao = request.getSession();
		
		if(sessao.getAttribute("usuario") == null) {
			return false;
		}else {
			return true;
		}
	}
	
	
	
}
