public class Gerente extends Empregado {
	private String nomeGerencia;

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	@Override
	public String toString() {
		return "Gerente: " + super.getNome() + "\nIdade: " + super.getIdade() 
		+ "\nMatricula: " + super.getMatricula() + "\nNome da gerência: " + getNomeGerencia() + "\nValor do INSS: " + valorinss();
	}
}
