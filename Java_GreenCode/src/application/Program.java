package application;

import java.util.Scanner;

import entities.Funcionario;
import entities.Paciente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 
		Paciente para teste 
		Email: Joao@gmail.com 
		Senha: Joao-2012 
		*/
		Paciente Joao = new Paciente("João Silva", "Joao@gmail.com", "2012", "01234567891", "Joao-2012", "01234567891", "12345678", "Masculino", "AB+");
		
		/* 
		Funcionario para teste 
		Email: Agatha@gmail.com 
		Senha: Agatha-2000 
		*/
		Funcionario Agatha = new Funcionario("Agatha Alves", "Agatha@gmail.com", "2000", "12345678910", "Agatha-2000", "Médico", "123456");
		
		Paciente paciente = new Paciente();
		Funcionario funcionario = new Funcionario();
		
		char menu = 's';
		do {
			System.out.println("\n       # GreenCode #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) Paciente      -");
			System.out.println("  -   (2) Funcionario   -");
			System.out.println("  -   (0) Sair          -");
			System.out.println("  ----------------------- ");
			
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
			
			if(menu == '1') {
				System.out.println("\n       # Paciente #");
				System.out.println("  ----------------------- ");
				System.out.println("  -   (1) Login         -");
				System.out.println("  -   (2) Cadastrar-se  -");
				System.out.println("  -   (0) Menu          -");
				System.out.println("  ----------------------- ");
				
				System.out.print("    Escolha uma Opção: ");
				menu = sc.next().toLowerCase().charAt(0);
				
				if(menu == '1') {
					System.out.print("\n    Digite o seu Email: ");
					String login = sc.next();
					
					if(Joao.getEmail().equals(login)) {
						System.out.print("\n    Digite a seu Senha: ");
						login = sc.next();
						
						if(Joao.getPassword().equals(login)) {
							Joao.MenuPaciente();
						}
					}
					
					else {
						System.out.print("\n    Erro no Login"
								+ "\n    Tentar Novamente  \n");
					}
				}
				else if(menu == '2') {
					System.out.println("\n      # Paciente #");
					System.out.println("  ----------------------- ");
					System.out.println("       Cadastrar-se       \n");
					
					System.out.print("  Nome: ");
					sc.nextLine();
					String cadastro = sc.nextLine();
					paciente.setName(cadastro);
					
					paciente.validarEmail();
					paciente.validarData();
					paciente.validarCPF();
					paciente.validarPhone();
					paciente.validarCEP();
					paciente.validarSenha();
					paciente.validarSexo();
					paciente.validarTipoSangue();
					
					paciente.MenuPaciente();	
				}
			}
			else if(menu == '2') {
				System.out.println("\n      # Funcionario #");
				System.out.println("  ----------------------- ");
				System.out.println("  -   (1) Login         -");
				System.out.println("  -   (2) Cadastrar-se  -");
				System.out.println("  -   (0) Menu          -");
				System.out.println("  ----------------------- ");
				
				System.out.print("    Escolha uma Opção: ");
				menu = sc.next().toLowerCase().charAt(0);
				
				if(menu == '1') {
					System.out.print("\n    Digite o seu Email: ");
					String login = sc.next();
					
					if(Agatha.getEmail().equals(login)) {
						System.out.print("\n    Digite a seu Senha: ");
						login = sc.next();
						
						if(Agatha.getPassword().equals(login)) {
							Agatha.MenuFuncionario();
						}
					}
					
					else {
						System.out.print("\n    Erro no Login"
								+ "\n    Tentar Novamente  \n");
					}
				}
				
				else if(menu == '2') {
					System.out.println("\n      # Funcionario #");
					System.out.println("  ----------------------- ");
					System.out.println("       Cadastrar-se       \n");
					
					System.out.print("  Nome: ");
					sc.nextLine();
					String cadastro = sc.nextLine();
					funcionario.setName(cadastro);						
					
					funcionario.validarEmail();
					funcionario.validarData();
					funcionario.validarCPF();
					funcionario.validarId();
					funcionario.validarSenha();
					
					System.out.print("  Cargo: ");
					cadastro = sc.next();
					funcionario.setCargo(cadastro);
					
					funcionario.MenuFuncionario();	
				}
			}
			
			else if(menu == '0') {
				System.out.print("\n     Continuar(s/n): ");
				menu = sc.next().toLowerCase().charAt(0);
			}
			
		} while (menu != 's' );
		System.out.println("\n  Obrigado por usar o nosso Sistema.\n");
		System.out.println("           GreenCode - Dev Team         ");
		System.out.println("  #------------------------------------#");
		System.out.println("  | Nome: Luccas Silva    | RM: 552890 | ");
		System.out.println("  | Nome: Daniel Fernando | RM: 553785 |");
		System.out.println("  | Nome: Igor Gabriel    | RM: 553544 |");
		System.out.println("  #------------------------------------#");
		
		sc.close();

	}

}
