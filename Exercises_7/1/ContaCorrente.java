import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria {

	private int qntTrans;
	
	public ContaCorrente(int senha) {
		super(senha);
	}
	
	public void sacar (double valor) {
		this.saldo -= valor;
		qntTrans++;
	}
	
	public void depositar (double valor) {
		this.saldo += valor;
		qntTrans++;
	}
	
	public void tirarExtrato () {
		JOptionPane.showMessageDialog(null, "Tipo de conta: Corrente" + 
				"\nConta: " + this.getNumero() + "\nSaldo: " + this.getSaldo()
				+ "\nQuantidade de transferências: " + this.getQntTrans());
	}

	public int getQntTrans() {
		return qntTrans;
	}
}
