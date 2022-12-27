import javax.swing.JOptionPane;

public class Quadrado {
	public static void main(String args[]) {
		
		double n, q;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Diga um valor"));
		
		q = n * n;
		
		JOptionPane.showMessageDialog(null, "Valor ao quadrado: " + q);
		
	}

}
