public class Mensalista extends Funcionario implements IGeral {
	
	private float salario;
	private int diasFaltosos;
	
	public Mensalista() {}

	public Mensalista(float salario, int diasFaltosos) {
		super();
		this.salario = salario;
		this.diasFaltosos = diasFaltosos;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getDiasFaltosos() {
		return diasFaltosos;
	}

	public void setDiasFaltosos(int diasFaltosos) {
		this.diasFaltosos = diasFaltosos;
	}

	public Mensalista(String nome, String carteiraProfissional) {
		super(nome, carteiraProfissional);
	}

	public Mensalista(String carteiraProfissional) {
		super(carteiraProfissional);
	}
	
	public float calculaSalario() {
		return this.salario -= (getDiasFaltosos() * (getSalario() / 30));
	}

	public void imprimirDados() {
		System.out.println("\nNome: " + getNome());
		System.out.println("\nCarteira profissional: " + getCarteiraProfissional());
		System.out.println("\nSalário bruto: " + getSalario());
		System.out.println("\nDias Faltosos: " + getDiasFaltosos());
		System.out.println("\nSalário líquido: " + calculaSalario());
	}

}
