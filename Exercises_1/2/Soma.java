import javax.swing.JOptionPane;

public class Soma {
	public static void main(String args[]) {
		double qtde1, qtde2, qtde3, valor1, valor2, valor3, qv1, qv2, qv3, total;
		
		qtde1 = Double.parseDouble(JOptionPane.showInputDialog("Diga a quantidade 1"));
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Diga o valor 1"));
		qv1 = qtde1*valor1;
		
		qtde2 = Double.parseDouble(JOptionPane.showInputDialog("Diga a quantidade 2"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Diga o valor 2"));
		qv2 = qtde2*valor2;
		
		qtde3 = Double.parseDouble(JOptionPane.showInputDialog("Diga a quantidade 3"));
		valor3 = Double.parseDouble(JOptionPane.showInputDialog("Diga o valor 3"));
		qv3 = qtde3*valor3;
		
		total = qv1 + qv2 + qv3;
		
		JOptionPane.showMessageDialog(null, "Total " + total);
		}
}
