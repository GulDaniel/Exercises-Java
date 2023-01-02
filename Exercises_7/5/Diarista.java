public class Diarista extends Funcionario implements IGeral {
	
	private float valorDia;
	int qtdeDias;
	
	public Diarista(float valorDia, int qtdeDias) {
		super();
		this.valorDia = valorDia;
		this.qtdeDias = qtdeDias;
	}

	public Diarista() {
		super();
	}

	public Diarista(String nome, String carteiraProfissional) {
		super(nome, carteiraProfissional);
	}

	public Diarista(String carteiraProfissional) {
		super(carteiraProfissional);
	}

	public float getValorDia() {
		return valorDia;
	}

	public void setValorDia(float valorDia) {
		this.valorDia = valorDia;
	}

	public int getQtdeDias() {
		return qtdeDias;
	}

	public void setQtdeDias(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}
	
	public float calculaSalario() {
		return getValorDia() * getQtdeDias();
	}

	public void imprimirDados() {
		System.out.println("\nNome: " + getNome());
		System.out.println("\nCarteira profissional: " + getCarteiraProfissional());
		System.out.println("\nValor da diária: " + getValorDia());
		System.out.println("\nQuantidade de dias trabalhados: " + getQtdeDias());
		System.out.println("\nSalário: " + calculaSalario());
	}
}
