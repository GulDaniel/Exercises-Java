import javax.swing.JOptionPane;

public class Reajuste {
	public static void main(String args[]) {
	double ano = 1995, salario = 1000, aumento = 0.015;
			for (; ano < 2022; ano++) {
				salario = salario + (salario * aumento);
				aumento *= 2;
			}
			
			JOptionPane.showMessageDialog(null, "Salário atual R$: " + salario);
	}
}

