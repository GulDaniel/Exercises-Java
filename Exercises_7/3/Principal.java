public class Principal {
	public static void main(String args[]) {
		
		String a = "";
		String b = "";
		
		EntradaSaidaConsole e1 = new EntradaSaidaConsole();
		EntradaSaidaWin e2 = new EntradaSaidaWin();
		
		e1.lerTeclado(a);
		e1.apresentar(a);
		
		e2.lerTeclado(b);
		e2.apresentar(b);
	}
}
