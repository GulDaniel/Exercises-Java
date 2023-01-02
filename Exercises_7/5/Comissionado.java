public class Comissionado extends Mensalista implements IGeral {

	private float valorComissao;

	public Comissionado(float valorComissao) {
		super();
		this.valorComissao = valorComissao;
	}
	
	public Comissionado() {}

	public Comissionado(String nome, String carteiraProfissional) {
		super(nome, carteiraProfissional);
	}

	public Comissionado(String carteiraProfissional) {
		super(carteiraProfissional);
	}

	public float getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(float valorComissao) {
		this.valorComissao = valorComissao;
	}
	
	public float calculaSalario() {
		return getSalario() + valorComissao;
	}
	
	public void imprimirDados() {
		System.out.println("\nNome: " + getNome());
		System.out.println("\nCarteira profissional: " + getCarteiraProfissional());
		System.out.println("\nSalário bruto: " + getSalario());
		System.out.println("\nDias Faltosos: " + getDiasFaltosos());
		System.out.println("\nSalário líquido: " + calculaSalario());
	}
}
