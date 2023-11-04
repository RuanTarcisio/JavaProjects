package controller;

import controller.helper.LoginHelper;
import model.Usuario;
import model.dao.UsuarioDAO;
import view.Login;
import view.MenuPrincipal;

public class LoginController {

	private LoginHelper helper;
	private final Login view;

	public LoginController(Login view) {
		this.view = view;
		this.helper = new LoginHelper(view);
	}

	public void entrarNoSistema() {

		Usuario usuario = helper.obterModelo();
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario autenticado = usuarioDao.selectPorNomeESenha(usuario);
		
		if(autenticado != null) {
			MenuPrincipal menu = new MenuPrincipal();
			menu.main(null);
			view.fecharTela();
		}else {
			System.out.println("Usuario nao encontrado");
		}
	}

	public void fizTarefa() {
		System.out.println("Busquei algo do BD");

		this.view.exibeMensagem("Executei o fizTarefa");
	}
}
