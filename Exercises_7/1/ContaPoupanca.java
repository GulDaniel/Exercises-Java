import javax.swing.JOptionPane;

public class ContaPoupanca extends ContaBancaria {
	
	private double txRend = 0.05;
	
	public ContaPoupanca (int senha) {
		super(senha);
	}
	
	public void sacar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	public double getTxRend() {
		return txRend;
	}

	public void tirarExtrato () {
		JOptionPane.showMessageDialog(null, "Tipo de conta: Corrente" + 
				"\nConta: " + this.getNumero() + "\nSaldo: " + this.getSaldo()
				+ "\nTaxa de Rendimento: " + this.getTxRend());
	}
}
