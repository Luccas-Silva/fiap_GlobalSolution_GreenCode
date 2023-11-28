package entities;

import java.util.Date;

public class Paciente extends User {
	
	private String telefone;
	private String endereco;
	private String sexo;
	private String tipoSanguineo;
	
	public Paciente(String name, String email, Date dataNascimento, String cpf, String password, String telefone,
			String endereco, String sexo, String tipoSanguineo) {
		super(name, email, dataNascimento, cpf, password);
		this.telefone = telefone;
		this.endereco = endereco;
		this.sexo = sexo;
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public void Registro() {
		System.out.println("Paciente ["+
				"name=" +getName()+ 
				", email=" +getEmail()+
				", dataNascimento=" +getDataNascimento()+
				", cpf=" +getCpf()+
				", password=" +getPassword()+
				", telefone=" +telefone+
				", endereco=" +endereco+
				", sexo=" +sexo+
				", tipoSanguineo=" + tipoSanguineo +
				"]");
	}
}
