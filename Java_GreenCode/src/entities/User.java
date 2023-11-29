package entities;

import java.util.Scanner;

public class User {
	
	private String name; 
	private String email; 
	private String nascimento; 
	private String cpf; 
	private String password; 
	
	Scanner sc = new Scanner(System.in);
	
	public User() {
	}
	public User(String name, String email, String nascimento, String cpf, String password) {
		this.name = name;
		this.email = email;
		this.nascimento = nascimento;
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
	
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
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
	
	
	public void validarEmail() {
		boolean flag = false;
		do {
			System.out.print("  Email: ");
			String cadastro = sc.nextLine();
			email = cadastro;
			for(int i=0; i<email.length(); i++){
				if(email.charAt(i) == '@'){
					flag = true;
				}
			}
			if(flag != true) {
				System.out.println("  Email Invalido.\n");
			}
		} while (flag != true);
	}
	
	public void validarData() {
		boolean flag = false;
		do {
			System.out.print("  Ano de Nacimento: ");
			String cadastro = sc.next();
			nascimento = cadastro;
			if(nascimento != null && nascimento.matches("[0-9.]+")){
				if(nascimento.length() == 4) {
					flag = true;
				}
			}
			
			if(flag != true) {
				System.out.println("  Data Invalido.\n");
			}
		} while (flag != true);
		
	}
	
	public void validarCPF() {
		boolean flag = false;
		do {
			System.out.print("  CPF: ");
			String cadastro = sc.next();
			cpf = cadastro;
			if(cpf != null && cpf.matches("[0-9.]+")){
				if(cpf.length() == 11) {
					flag = true;
				}
			}
			if(flag != true) {
				System.out.println("  CPF Invalido.\n");
			}
		} while (flag != true);
		
		
		
		
	}
	
	public void Registro() {
		System.out.println("User ["
				+ "name=" + name +
				", email=" + email + 
				", nascimento=" + nascimento + 
				", cpf=" + cpf + 
				", password="+ password +
				"]");
	}

}
