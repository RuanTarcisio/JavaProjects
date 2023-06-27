package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Connec;
import dao.UserDAO;
import model.UserGame;
import view.LoginView;

public class LoginController {
	private LoginView view;

	public LoginController(LoginView view) {
		this.view = view;
	}
	
public void validation() {
	
	/*SEARCH USER ON VIEW
	 * USER FOUNDED?
	 * 
	 * */
	
	String nickName = view.getTextField_NickName().getText();
	String password = view.getTextField_Password().getText();
	
	UserGame userValidation = new UserGame(nickName, password);
	
	try {
		
		Connection connection = new Connec().getConnection();
		UserDAO userDAO = new UserDAO(connection);
		userDAO.authenticateUserInDB(userValidation);
		
		boolean hasUser = userDAO.authenticateUserInDB(userValidation);
		
		if(hasUser) {
			JOptionPane.showMessageDialog(null, "Acess granted");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong nickname or pass, try again");
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}

}
