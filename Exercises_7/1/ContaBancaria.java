import javax.swing.JOptionPane;

public abstract class ContaBancaria {
	
	private int senha, numero;
	double saldo;
	
	public ContaBancaria (int senha) {
		this.senha = senha;
		numero = (int)(Math.random()*10000);
	}
	
	public static ContaBancaria criarConta(int senha) {
		int tipoConta = Integer.parseInt(JOptionPane.showInputDialog(
				"Qual tipo de conta deseja criar?\n1- Corrente\n2- Poupança"));
		
		if (tipoConta == 1) {
			return new ContaCorrente(senha);
		}else {
			return new ContaPoupanca(senha);
		}
	}
	
	public abstract void sacar (double valor);
	public abstract void depositar (double valor);
	public abstract void tirarExtrato ();
	
	public void alterarSenha (int novaSenha) {
		int verificaSenha = Integer.parseInt(JOptionPane.showInputDialog("Confirme sua senha anterior:"));
		if (verificaSenha == this.senha) {
			this.senha = novaSenha;
			JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Senha incorreta, alteração não realizada");
		}		
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}