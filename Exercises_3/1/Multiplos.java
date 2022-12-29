import javax.swing.JOptionPane;

public class Multiplos {
	public static void main(String args[]) {
	int soma = 0;
			for (int i = 0; i < 501; i+=3) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
		JOptionPane.showMessageDialog(null, "Soma dos ímpares multiplos de 03 de 00 até 500: " + soma);
	}
}

