package entities;

public class User {
	
	private String name; 
	private String email; 
	private String nascimento; 
	private String cpf; 
	private String password; 
	
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
	
	
	public boolean validarEmail() {
		boolean flag = false;
		
		for(int i=0; i<email.length(); i++){
			if(email.charAt(i) == '@'){
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean validarData() {
		boolean flag = false;
		if(nascimento != null && nascimento.matches("[0-9.]+")){
			if(nascimento.length() == 4) {
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean validarCPF() {
		boolean flag = false;
		if(cpf != null && cpf.matches("[0-9.]+")){
			if(cpf.length() == 11) {
				flag = true;
			}
		}
		return flag;
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
