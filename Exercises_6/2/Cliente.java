public class Cliente extends Pessoa{
	private double ValorDivida;
	private int anoNascim;
	public double getValorDivida() {
		return ValorDivida;
	}
	public void setValorDivida(double valorDivida) {
		ValorDivida = valorDivida;
	}
	public int getAnoNascim() {
		return anoNascim;
	}
	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}
	@Override
	public String toString() {
		return "Cliente: " + super.getNome() + "\nIdade: " + super.getIdade() 
		+ "\nSexo: " + super.getSexo() + "\nValor Divida: " + ValorDivida + "\nAno de Nascimento: " + anoNascim;
	}
	
}
