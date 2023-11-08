package service;

import model.Usuario;
import view.Login;

public class LoginService implements IService{
	
	private final Login view;
	
	public LoginService(Login view) {
		this.view = view;
	}

	public Usuario obterModelo() {
		String usuario = view.getTextField_Usuario().getText(); 
		String senha = view.getTextField_Senha().getText();
		Usuario modelo = new Usuario(0, usuario, senha);
		
		return modelo;
	}
	
	public void setModelo(Usuario modelo) {
		String senha = modelo.getSenha();
		String usuario = modelo.getNome();
		
		view.getTextField_Senha().setText(senha);
		view.getTextField_Usuario().setText(usuario);
	}
	
	public void limparTela() {
		view.getTextField_Senha().setText("");
		view.getTextField_Usuario().setText("");
	}
}
