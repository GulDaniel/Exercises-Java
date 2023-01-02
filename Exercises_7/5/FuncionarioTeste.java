public class FuncionarioTeste {
	public static void main(String args[]) {
		
		Diarista d1 = new Diarista("Fritz", "8273");
		Mensalista m1 = new Mensalista("Helena", "3573");
		Comissionado c1 = new Comissionado("Hans", "1256");
		
		d1.setQtdeDias(22);
		d1.setValorDia(45.90f);
		
		m1.setSalario(1958.30f);
		m1.setDiasFaltosos(3);
		
		c1.setSalario(1668.15f);
		c1.setDiasFaltosos(1);
		c1.setValorComissao(220);
		
		d1.imprimirDados();
		m1.imprimirDados();
		c1.imprimirDados();
	}
}
