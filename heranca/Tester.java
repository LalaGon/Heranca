package gerente.heranca;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Aluna: Lais G. Senna");
		System.out.println("Matricula: 0050015880");
		System.out.println("\n");
		
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		Gerente gerente2 = new Gerente();
		
		System.out.println("\n---GERENTE---\n");
		
		//DEFINIR SENHA
		Scanner input = new Scanner(System.in);
		System.out.println("Configure uma senha de acesso: ");
		int pass = input.nextInt();
		
		gerente.setSenhaEspecial(pass);
		
		//ENTRAR COM DADOS - NOME - DE GERENTE
		Scanner input2 = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = input2.nextLine();
		
		gerente.setNome(nome);
	
		//DEFINIR SALARIO
		Scanner input4 = new Scanner(System.in);
		System.out.println("Digite seu salario: ");
		double sal = input4.nextInt();
		
		gerente.setSalario(sal);
		
		//DIGITE SUA SENHA DE ACESSO
		Scanner input3 = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		int pass2 = input3.nextInt();
		
		gerente.autentica(pass2);
		
		
		
		System.out.println("\n---FUNCIONARIO---\n");
		
		//DEFINIR NOME DE FUNCIONARIO
		Scanner input5 = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nomeF = input5.nextLine();
		
		funcionario.setNome(nomeF);

		//DEFINIR CPF DE FUNCIONARIO
		Scanner input6 = new Scanner(System.in);
		System.out.println("Digite seu CPF: ");
		int cpf = input6.nextInt();
		
		funcionario.setCpf(cpf);
		
		//DEFINIR SALARIO DE FUNCIONARIO
		Scanner input7 = new Scanner(System.in);
		System.out.println("Digite seu salario: ");
		int salF = input7.nextInt();
		
		funcionario.setSalario(salF);
		
		System.out.println("Funcionario: " + funcionario.getNome() + " - Bonificacao: " + funcionario.getBonificacao());
		
		
		
		/*
		

		
		//FUNCIONARIO
		funcionario.setNome("Laila");
		funcionario.setCpf(999-888-777-66);
		funcionario.setSalario(100.0);
		System.out.println("Funcionario: " + funcionario.getNome() + " - Bonificacao: " + funcionario.getBonificacao() );
*/	}
	
}	
	


