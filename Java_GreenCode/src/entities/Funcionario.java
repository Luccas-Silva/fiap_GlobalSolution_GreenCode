package entities;

import java.util.Scanner;

public class Funcionario extends User {

	private String cargo;
	private String id_Funcionario;
	
	Scanner sc = new Scanner(System.in);
	
	public Funcionario() {
		super();
	}
	public Funcionario(String name, String email, String nascimento, String cpf, String password, String cargo,
			String id_Funcionario) {
		super(name, email, nascimento, cpf, password);
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
	
	public boolean validarId() {
		boolean flag = false;
		if(id_Funcionario != null && id_Funcionario.matches("[0-9.]+")){
			if(id_Funcionario.length() == 6) {
				flag = true;
			}
		}
		return flag;
	}
	
	public void Diagnostico() {
		char menu = 's';
		do {
			System.out.println("\n     # Diagnosticos #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) Pacientes     -");
			System.out.println("  -   (0) Menu          -");
			System.out.println("  ----------------------- ");
			
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
			
			if(menu == '1') {
				System.out.println("\n       # Pacientes #");
				System.out.println("  ----------------------- ");
				System.out.println("  -   (1) Dante         -");
				System.out.println("  -   (2) Zelda         -");
				System.out.println("  -   (3) Mereoleona    -");
				System.out.println("  -   (0) Menu          -");
				System.out.println("  ----------------------- ");
				System.out.print("    Escolha uma Opção: ");
				menu = sc.next().toLowerCase().charAt(0);
				
				if(menu == '1') {
					System.out.println("\n  Eu, Dante, enfrento uma condição persistente "
							+ "\n  desde 28/11/2023, caracterizada por dores de cabeça latejantes,"
							+ "\n  agitação, irritabilidade, náuseas, vômitos e sensibilidade"
							+ "\n  extrema à luz, sons e cheiros.");
					System.out.print("\n  Chamar para a video chamada (s/n): ");
					menu = sc.next().toLowerCase().charAt(0);
				}
				else if(menu == '2') {
					System.out.println("\n  Eu, Zelda, estou enfrentando sintomas preocupantes desde 27/11/2023,"
							+ "\n  incluindo febre alta, dores intensas no corpo, dores de cabeça severas, fadiga extrema."
							+ "\n  Esses sinais comprometem minha capacidade diária e sugerem uma possível infecção por dengue.");
					System.out.print("\n  Chamar para a video chamada (s/n): ");
					menu = sc.next().toLowerCase().charAt(0);
				}
				else if(menu == '3') {
					System.out.print("\n  Eu, Mereoleona, enfrento desconforto persistente devido a sintomas de rinite,"
							+ "\n  incluindo congestão nasal, espirros, coceira no nariz e na garganta, e olhos lacrimejantes,"
							+ "\n  presentes desde 10/11/2023. Esses sintomas prejudicam minha qualidade de vida e interferem nas atividades diárias"
							+ "\n  e no sono, apesar das tentativas de evitar alérgenos conhecidos.");
					System.out.print("\n  Chamar para a video chamada (s/n): ");
					menu = sc.next().toLowerCase().charAt(0);
				}
			}
			else if(menu == '0') {
				System.out.print("\n     Continuar (s/n): ");
				menu = sc.next().toLowerCase().charAt(0);
			}
		} while (menu != 's');
		
	}
	
	public void Registro() {
		System.out.println("Funcionario:"+
				"\n Name: " + getName() +
				"\n Email: " + getEmail() + 
				"\n Nascimento: " + getNascimento() + 
				"\n CPF: " + getCpf() + 
				"\n Senha: "+ getPassword() +
				"\n Cargo: " + cargo +
				"\n ID: " + id_Funcionario);
	} 

	
}
