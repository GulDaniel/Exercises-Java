public class Funcionario {
	private int matricula, idade;
	private String nome, cargo;
	private double salario;
	
	public Funcionario() {
		salario = 1500;
	}
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome, int matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nMatricula: " + matricula + "\nIdade: " + idade + "\nNome: " + nome + "\nCargo: " + cargo
				+ "\nsalario: " + salario;
	}
}
