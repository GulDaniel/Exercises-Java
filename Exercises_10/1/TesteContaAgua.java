public class TesteContaAgua {
	public static void main(String[] args) {
		
		ContaAgua c1 = new ContaAgua();
		ContaAgua c2 = new ContaAgua();
		ContaAgua c3 = new ContaAgua();
		
		c1.setAno(2022);
		c1.setM3(20);
		c1.setMês(2);
		c1.setNúmero(871248);
		
		c2.setAno(2022);
		c2.setM3(12);
		c2.setMês(3);
		c2.setNúmero(174241);
		
		c3.setAno(2022);
		c3.setM3(10);
		c3.setMês(4);
		c3.setNúmero(465258);
		
		c1.imprimirDados();
		c2.imprimirDados();
		c3.imprimirDados();
	}
}
