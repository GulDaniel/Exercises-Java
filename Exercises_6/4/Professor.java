public class Professor extends Funcionario {
	
	@Override
	public double getSalarioPrimeiraParcela() {
		return salario;
	}
	
	@Override
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
