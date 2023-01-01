public class Conta {
    double saldo = 0;
	
	public void sacar(double saque) {
		saldo -= saque;
	}
	
	public void depositar (double deposito) {
		saldo += deposito;
	}
}
