package application;

import java.util.Scanner;

import entities.Funcionario;
import entities.Paciente;
import entities.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User u1 = new User("Luccas", null, null, null, null);
		Paciente p1 = new Paciente("joao", null, null, null, null, null, null, null, null);
		Funcionario f1 = new Funcionario("maria", null, null, null, null, null, null);
		
		u1.Registro();
		p1.Registro();
		f1.Registro();
	
		sc.close();

	}

}
