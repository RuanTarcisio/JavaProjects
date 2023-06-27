package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Connec;
import dao.UserDAO;
import model.UserGame;
import view.AcessView;

public class AcessController {
	
	private AcessView view;

	public AcessController(AcessView view) {
		this.view = view;
	}
	
	public void saveUser() {
		String name = view.getTextField_User().getText();
		String nickname = view.getTextField_NickName().getText();
		String password = view.getTextField_Pass().getText();
		
		UserGame user = new UserGame(name, nickname, password);
		
		try {
			
			Connection connection = new Connec().getConnection();
			UserDAO userDAO = new UserDAO(connection); 
			userDAO.insert(user);
			JOptionPane.showMessageDialog(null, "Sucess");
			
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "User don't save");
			e1.printStackTrace();
			
		}
	}
	
}
