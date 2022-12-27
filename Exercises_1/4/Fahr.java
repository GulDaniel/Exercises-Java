import javax.swing.JOptionPane;

public class Fahr {
	public static void main(String args[]) {
		
		double C, F;
		
		C = Double.parseDouble(JOptionPane.showInputDialog("Diga a temperatura em Celsius"));
		
		F = (9*C + 160) / 5;
		
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit " + F);
		
	}
}
