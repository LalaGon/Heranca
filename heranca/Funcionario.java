package gerente.heranca;

public class Funcionario {
	private String nome;
	private int cpf;
	private double salario;
	
	//metodo interno
	public double getBonificacao() {
		return this.salario * 0.10;
	}

	//metodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf2) {
		this.cpf = cpf2;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
	
}
