public class Poupanca extends Conta{
	private int diaRendimento = 5;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public void sacar(double saque) {
		if (saldo - saque < 0) {
			return;
		}else {
		saldo -= saque;
		}
	}
}
