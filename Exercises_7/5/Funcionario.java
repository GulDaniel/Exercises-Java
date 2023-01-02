public class Funcionario {

	private String nome, carteiraProfissional;

	public Funcionario(){}
	
	public Funcionario(String carteiraProfissional){
		this.carteiraProfissional = carteiraProfissional;
	}
	
	public Funcionario(String nome, String carteiraProfissional){
		this.nome = nome;
		this.carteiraProfissional = carteiraProfissional;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCarteiraProfissional() {
		return carteiraProfissional;
	}

	public void setCarteiraProfissional(String carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}

	public float calculaSalario() {
		return 0.0f;
	}
}
