public class ContaTeste {
	public static void main(String args[]) {
		ContaBancaria c1 = ContaBancaria.criarConta(9428);
		ContaBancaria c2 = ContaBancaria.criarConta(8249);
		ContaBancaria c3 = ContaBancaria.criarConta(2984);
		
		c1.depositar(500);
		c1.depositar(120);
		c2.depositar(1200);
		c3.depositar(1900);
		
		c1.sacar(150);
		c2.sacar(2000);
		c3.sacar(300);
		
		c1.tirarExtrato();
		c2.tirarExtrato();
		c3.tirarExtrato();
	}
}
