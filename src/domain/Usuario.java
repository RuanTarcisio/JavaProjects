package domain;

import java.util.Date;

public class Usuario extends Pessoa{
	
	private String senha;
	private String nivel_acesso;
	
	public Usuario(int id, String nome, String senha, String nivel_acesso) {
		super(id, nome);
		this.senha = senha;
		this.nivel_acesso = nivel_acesso;
	}
	
	public Usuario(int id, String nome, String senha) {
		super(id, nome);
		this.senha = senha;
	}

	public Usuario(int id, String nome, char sexo, Date data_nascimento, String telefone, String email, String rg,
			String senha, String nivel_acesso) {
		super(id, nome, sexo, data_nascimento, telefone, email, rg);
		this.senha = senha;
		this.nivel_acesso = nivel_acesso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivel_acesso() {
		return nivel_acesso;
	}

	public void setNivel_acesso(String nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}
		
	
}
