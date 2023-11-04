package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
	private int id;
	private String nome;
	private char sexo;
	private Date data_nascimento;
	private String telefone;
	private String email;
	private String rg;
		
	public Pessoa(int id, String nome, char sexo, String data_nascimento, String telefone, String email, String rg) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		try {
			this.data_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data_nascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
	}
	
	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}
