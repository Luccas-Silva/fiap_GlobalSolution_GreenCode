package entities;

import java.util.Date;

public class Funcionario extends User {

	private String cargo;
	private String id_Funcionario;
	
	public Funcionario(String name, String email, Date dataNascimento, String cpf, String password, String cargo,
			String id_Funcionario) {
		super(name, email, dataNascimento, cpf, password);
		this.cargo = cargo;
		this.id_Funcionario = id_Funcionario;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getId_Funcionario() {
		return id_Funcionario;
	}
	public void setId_Funcionario(String id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}

	public void Registro() {
		System.out.println("Funcionario "+ 
				"[name=" +getName()+ 
				", email=" +getEmail()+
				", dataNascimento=" +getDataNascimento()+
				", cpf=" +getCpf()+
				", password=" +getPassword()+
				", cargo=" + cargo +
				", id_Funcionario=" + id_Funcionario +
				"]");
	}
}
