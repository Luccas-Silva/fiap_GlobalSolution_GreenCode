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
	
	public void validarPhone() {
		boolean flag = false;
		do {
			System.out.print("  Phone: ");
			String cadastro = sc.next();
			setPhone(cadastro);
			if(phone != null && phone.matches("[0-9.]+")){
				if(phone.length() == 11) {
					flag = true;
				}
			}
			else {
				System.out.println("  Phone Invalido.\n");
			}
		} while (flag != true);
		
		
	}
	
	public void validarCEP() {
		boolean flag = false;
		do {
			System.out.print("  CEP: ");
			String cadastro = sc.next();
			setCep(cadastro);
			
			if(cep != null && cep.matches("[0-9.]+")){
				if(cep.length() == 8) {
					flag = true;
				}
			}
			else {
				System.out.println("  CEP Invalido.\n");
			}
			
		} while (flag != true);
	}
	
	public void validarSexo() {
		boolean flag = false;
		char menu = 's';
		do {
			System.out.println("\n   #  Sexo Paciente  #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) Masculino     -");
			System.out.println("  -   (2) Feminino      -");
			System.out.println("  -   (3) Outros        -");
			System.out.println("  ----------------------- ");
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
				if(menu == '1') {
					sexo = "Masculino";
					flag = true;
				}
				
				else if(menu == '2') {
					sexo = "Feminino";
					flag = true;
				}
				
				else if(menu == '3') {
					sexo = "Outros";
					flag = true;
				}
				else {
					System.out.println("  Opção Invalido.\n");
				}
		} while (flag != true);
	}
	
	public void validarTipoSangue() {
		boolean flag = false;
		char menu = 's';
		do {
			System.out.println("\n    # Tipo Sanguíneo  #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) A+            -");
			System.out.println("  -   (2) B+            -");
			System.out.println("  -   (3) AB+           -");
			System.out.println("  -   (4) O+            -");
			System.out.println("  -   (5) A-            -");
			System.out.println("  -   (6) B-            -");
			System.out.println("  -   (7) AB-           -");
			System.out.println("  -   (8) O-            -");
			System.out.println("  ----------------------- ");
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
				if(menu == '1') {
					tipoSangue = "A+";
					flag = true;
				}
				
				else if(menu == '2') {
					tipoSangue = "B+";
					flag = true;
				}
				
				else if(menu == '3') {
					tipoSangue = "AB+";
					flag = true;
				}
				else if(menu == '4') {
					tipoSangue = "O+";
					flag = true;
				}
				else if(menu == '5') {
					tipoSangue = "A-";
					flag = true;
				}
				else if(menu == '6') {
					tipoSangue = "B-";
					flag = true;
				}
				else if(menu == '7') {
					tipoSangue = "AB-";
					flag = true;
				}
				else if(menu == '8') {
					tipoSangue = "O";
					flag = true;
				}
				else {
					System.out.println("  Opção Invalido.\n");
				}
		} while (flag != true);
	}

	public void MenuPaciente() {
		char menu = 's';
		do {
			System.out.println("\n   # Paciente "+getName()+" #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) Registro      -");
			System.out.println("  -   (2) Declaração    -");
			System.out.println("  -   (0) Menu          -");
			System.out.println("  ----------------------- ");
			
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
			
			if(menu == '1') {
				Registro();
			}
			
			else if(menu == '2') {
				Declaracao();
			}

		}while (menu != '0');
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
				sc.nextLine();
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
		System.out.println("\n    Paciente:"+
				"\n     Name: " + getName() +
				"\n     Email: " + getEmail() + 
				"\n     Nascimento: " + getNascimento() + 
				"\n     CPF: " + getCpf() + 
				"\n     Senha: "+ getPassword() +
				"\n     Phone: " + phone +
				"\n     CEP: " + cep +
				"\n     Sexo: " + sexo +
				"\n     Tipo Sangue: " + tipoSangue);
	}

}
