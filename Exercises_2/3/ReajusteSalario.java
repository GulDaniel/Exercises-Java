import javax.swing.JOptionPane;

public class ReajusteSalario {
	public static void main(String args[]) {
		double salario;
			salario = Integer.parseInt(JOptionPane.showInputDialog("Diga o salário:"));
			if (salario <= 300) {
				salario *= 1.35;
			}else {
				salario *= 1.15;
			}
			JOptionPane.showMessageDialog(null, "Salário reajustado: " + salario);
	}
}

