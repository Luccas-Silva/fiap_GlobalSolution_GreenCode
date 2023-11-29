package application;

import java.util.Scanner;

import entities.Funcionario;
import entities.Paciente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Paciente para teste 
		Email: Joao@gmail.com 
		Senha: Joao-2012 */
		Paciente Joao = new Paciente("João Silva", "Joao@gmail.com", "2012", "01234567891", "Joao-2012", "01234567891", "12345678", "Masculino", "AB+");
		
		/* Funcionario para teste 
		Email: Agatha@gmail.com 
		Senha: Agatha-2000 */
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
							do {
								System.out.println("\n   # Paciente "+Joao.getName()+" #");
								System.out.println("  ----------------------- ");
								System.out.println("  -   (1) Registro      -");
								System.out.println("  -   (2) Declaração    -");
								System.out.println("  -   (0) Menu          -");
								System.out.println("  ----------------------- ");
								
								System.out.print("    Escolha uma Opção: ");
								menu = sc.next().toLowerCase().charAt(0);
								
								if(menu == '1') {
									Joao.Registro();
								}
								
								else if(menu == '2') {
									Joao.Declaracao();
								}

							}while (menu != '0');
						}
					}
					else {
						System.out.print("\n    Erro no Login"
								+ "\n    Tentar Novamente  \n");
			
					}
				}
				else if(menu == '2') {
					
						
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
					
					do {
						
						
						System.out.print("  Email: ");
						cadastro = sc.nextLine();
						funcionario.setEmail(cadastro);
						if(funcionario.validarEmail() == false) {
							System.out.println("  Email Invalido.\n");
						}
					} while (funcionario.validarEmail() != true);
					
					do {
						System.out.print("  Ano de Nacimento: ");
						cadastro = sc.next();
						funcionario.setNascimento(cadastro);
						if(funcionario.validarData() == false) {
							System.out.println("  Data Invalido.\n");
						}
					} while (funcionario.validarData() != true);
					
					do {
						System.out.print("  CPF: ");
						cadastro = sc.next();
						funcionario.setCpf(cadastro);
						if(funcionario.validarCPF() == false) {
							System.out.println("  CPF Invalido.\n");
						}
					} while (funcionario.validarCPF() != true);
					
					do {
						System.out.print("  ID: ");
						cadastro = sc.next();
						funcionario.setId_Funcionario(cadastro);
						if(funcionario.validarId() == false) {
							System.out.println("  ID Invalido.\n");
						}
					} while (funcionario.validarId() != true);
					
					System.out.print("  Cargo: ");
					cadastro = sc.next();
					funcionario.setCargo(cadastro);
					
					System.out.print("  Senha: ");
					cadastro = sc.next();
					funcionario.setPassword(cadastro);
					
					funcionario.MenuFuncionario();	
				}
			}
			
			else if(menu == '0') {
				System.out.print("\n     Continuar(s/n): ");
				menu = sc.next().toLowerCase().charAt(0);
			}
			
		} while (menu != 's' );
		System.out.println("\n Obrigado por usar o nosso Sistema.\n");
		System.out.println("    #        Dev Team       #");
		System.out.println("    -------------------------");
		
		
		sc.close();

	}

}
