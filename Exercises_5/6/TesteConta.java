import javax.swing.JOptionPane;

public class TesteConta {
		
		public static void main(String args[]) {
		
		String banco = "";

		Conta c1 = new Conta();
		Conta c2 = new Conta(35, 1285);
		Conta c3 = new Conta(12, 9854);
		
		banco += c1.imprimirEstado() + "\n" +
		c2.imprimirEstado() + "\n" +
		c3.imprimirEstado();

		JOptionPane.showMessageDialog(null, banco);
		
	}
}
