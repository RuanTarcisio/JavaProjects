package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.UserGame;

public class UserDAO {
	
	private final Connection connection;
		
	public UserDAO(Connection connection) {
		super();
		this.connection = connection;
	}
	
	public void insert (UserGame user) throws SQLException {
					
		String sql = "insert into usuario (name, nickname, pass) values ('"+ user.getName() +"', '"+user.getNickName() +"', '"+user.getPassword()+"');";
			
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute();
		connection.close();
			
								
	}

	public boolean authenticateUserInDB(UserGame userValidation) throws SQLException {
		
		//String sql = "select * from usuario where nickname = '"+userValidation.getNickName()+"' and pass = '"+userValidation.getPassword()+"'";
		
		String sql = "select * from usuario where nickname = ? and pass = ? ";
					
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, userValidation.getNickName());
		statement.setString(2, userValidation.getPassword());
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		
		/*if(resultSet.next()) {
			return true;
		}
		else
			return false;*/
		
		return resultSet.next();
		
	}

	
}

	


