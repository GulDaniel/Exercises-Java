public class Conta {
	
	private int agencia;
	private int conta; 
	
	public Conta() {}
	
	public Conta (int agencia, int conta){
		this.agencia = agencia;
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public String imprimirEstado() {
		return "\nAgência: " + this.getAgencia() + "\nConta: " + this.getConta();
	}
}
