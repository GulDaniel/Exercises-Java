public class Funcionario extends Pessoa {
	int matricula;
	double salario;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario > 0) {
		this.salario = salario;
		}else {
			return;
		}
	}
	
	public double getSalarioPrimeiraParcela() {
		return salario * 0.6;
	}
	
	public double getSalarioSegundaParcela() {
		return salario * 0.4;
	}
}
