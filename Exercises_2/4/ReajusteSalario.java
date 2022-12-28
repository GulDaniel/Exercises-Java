import javax.swing.JOptionPane;

public class ReajusteSalario {
	public static void main(String args[]) {
	double salario;
		salario = Integer.parseInt(JOptionPane.showInputDialog("Diga o salário:"));
		if (salario <= 300) {
			salario *= 1.15;
		}else if (salario <= 600){
			salario *= 1.10;
		}else if (salario <= 900) {
			salario *= 1.05;
		}else {
			salario *= 1;
		}
		JOptionPane.showMessageDialog(null, "Salário reajustado: " + salario);
	}
}

