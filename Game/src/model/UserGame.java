package model;

public class UserGame {

	private int id;
	private String name;
	private String nickName;
	private String password;
	
	
	public UserGame(String name, String nickName, String password) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.password = password;
	}
	
	
	public UserGame(String nickName, String password) {
		this.nickName = nickName;
		this.password = password;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
