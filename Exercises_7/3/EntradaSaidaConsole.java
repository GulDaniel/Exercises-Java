import java.util.Scanner;

public class EntradaSaidaConsole implements IEntradaSaida {

	public String lerTeclado(String s) {
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		scan.close();
		return s;
	}
	
	public void apresentar(String s) {
		System.out.println(s);
	}
}
