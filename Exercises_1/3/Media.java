import javax.swing.JOptionPane;

public class Media {
	public static void main(String args[]) {
		double n1, n2, n3, n4, m, total;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Diga o primeiro valor"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Diga o segundo valor"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Diga o terceiro valor"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Diga o quarto valor"));
		
		total = n1 + n2 + n3 + n4;
		m = total / 4;
		
		JOptionPane.showMessageDialog(null, "Soma " + total + "\nMédia " + m);
		
	}

}
