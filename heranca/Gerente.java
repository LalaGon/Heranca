package gerente.heranca;

public class Gerente extends Funcionario {
	private int senhaEspecial;
	private int numeroDeFuncionariosGerenciados;
	private double salario;
	
	
	//metodo construtor
	public void Gerente() {
		this.senhaEspecial = 0;
		this.numeroDeFuncionariosGerenciados = 0;
	}

	
	//metodos especiais
	public int getSenhaEspecial() {
		return senhaEspecial;
	}

	public void setSenhaEspecial(int senhaEspecial) {
		this.senhaEspecial = senhaEspecial;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public double getBonificacao() {
		return this.salario * 0.10 + 1000;   //return super.getBonificacao() + 1000; 
	}
	
	public void autentica(int senha) {
		if(this.senhaEspecial == senha ) {
				System.out.println("Acesso Liberado...");
				lista();
				
		}
		else {
			System.out.println("Acesso Negado.");
			
		}
	}
	public void lista() {
		System.out.println("Gerente: " + getNome() + " - Bonificacao: " + getBonificacao() );
	}

	
}
