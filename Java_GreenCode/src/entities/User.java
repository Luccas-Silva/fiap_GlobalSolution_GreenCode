package entities;

import java.util.Date;

public class User {
	
	private String name;
	private String email;
	private Date dataNascimento;
	private String cpf;
	private String password;
	
	public User(String name, String email, Date dataNascimento, String cpf, String password) {
		this.name = name;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	public void Registro() {
		System.out.println("User ["+ 
				"name=" +name+ 
				", email=" +email+
				", dataNascimento=" +dataNascimento+
				", cpf=" +cpf+
				", password=" +password+
				"]");
	}
}
