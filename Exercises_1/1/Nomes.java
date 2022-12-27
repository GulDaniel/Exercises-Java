import javax.swing.JOptionPane;

public class Nomes {
	
	public static void main(String args[]) {
	String n1, n2, n3;
	
	n1 = JOptionPane.showInputDialog("Digite o primeiro nome");
	n2 = JOptionPane.showInputDialog("Digite o segundo nome");
	n3 = JOptionPane.showInputDialog("Digite o terceiro nome");
	
	JOptionPane.showMessageDialog(
			null, "Primeiro nome " + n1 + "\nSegundo nome " + n2 + "\nTerceiro nome " + n3);
	
	}
}
