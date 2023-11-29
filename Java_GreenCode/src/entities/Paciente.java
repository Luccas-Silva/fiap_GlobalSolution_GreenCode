package entities;

import java.util.Scanner;

public class Paciente extends User {
	
	private String phone;
	private String cep;
	private String sexo;
	private String tipoSangue;
	
	private String Declaracao = "Nenhum Registro Encontrado";
	
	Scanner sc = new Scanner(System.in);
	
	public Paciente() {
		super();
	}
	public Paciente(String name, String email, String nascimento, String cpf, String password, String phone, String cep,
			String sexo, String tipoSangue) {
		super(name, email, nascimento, cpf, password);
		this.phone = phone;
		this.cep = cep;
		this.sexo = sexo;
		this.tipoSangue = tipoSangue;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getTipoSangue() {
		return tipoSangue;
	}
	public void setTipoSangue(String tipoSangue) {
		this.tipoSangue = tipoSangue;
	}
	
	public String getDeclaracao() {
		return Declaracao;
	}
	public void setDeclaracao(String declaracao) {
		Declaracao = declaracao;
	}
	
	public boolean validarPhone() {
		boolean flag = false;
		if(phone != null && phone.matches("[0-9.]+")){
			if(phone.length() == 11) {
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean validarCEP() {
		boolean flag = false;
		if(phone != null && phone.matches("[0-9.]+")){
			if(phone.length() == 8) {
				flag = true;
			}
		}
		return flag;
	}
	
	public String validarSexo() {
		return sexo;
		
		
	}
	
	public String validarTipoSangue() {
		return tipoSangue;
		
		 
	}
	
	public void Declaracao() {
		char menu = 's';
		do {
			System.out.println("\n       # Declaração #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) Atualizar     -");
			System.out.println("  -   (2) Ler           -");
			System.out.println("  -   (0) Menu          -");
			System.out.println("  ----------------------- ");
			
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
			if(menu == '1') {
				System.out.println("\n  Prezado "+getName()
						+"\n  Gostaríamos que realizasse uma breve descrição"
						+ "\n  sobre como tem se sentido recentemente: ");
				sc.next();
				Declaracao = sc.nextLine();
			}
			else if(menu == '2') {
				System.out.println("\n  "+Declaracao);
			}
			else if(menu == '0') {
				System.out.print("\n     Continuar (s/n): ");
				menu = sc.next().toLowerCase().charAt(0);
			}
		} while (menu != 's');
		
	}
	
	
 	public void Registro() {
		System.out.println("Paciente:"+
				"\n Name: " + getName() +
				"\n Email: " + getEmail() + 
				"\n Nascimento: " + getNascimento() + 
				"\n CPF: " + getCpf() + 
				"\n Senha: "+ getPassword() +
				"\n Phone: " + phone +
				"\n CEP: " + cep +
				"\n Sexo: " + sexo +
				"\n Tipo Sangue: " + tipoSangue);
	}

}
