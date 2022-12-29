import javax.swing.JOptionPane;

public class parcelasCarro {
	public static void main(String args[]) {
	double valorCarro = 0;
			
			valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Diga o preço do carro: "));
			
			JOptionPane.showMessageDialog(null, "Quantidade de parcelas" + "     Preço de cada parcela     " + "Preço final"
			+ "\n06                                                            " + String.format("%.2f                    ", (valorCarro * 1.03) / 6) + String.format("%.2f", valorCarro * 1.03)
			+ "\n12                                                            " + String.format("%.2f                    ", (valorCarro * 1.06) / 12) + String.format("%.2f", valorCarro * 1.06)
			+ "\n18                                                            " + String.format("%.2f                    ", (valorCarro * 1.09) / 18) + String.format("%.2f", valorCarro * 1.09)
			+ "\n24                                                            " + String.format("%.2f                    ", (valorCarro * 1.12) / 24) + String.format("%.2f", valorCarro * 1.12)
			+ "\n30                                                            " + String.format("%.2f                    ", (valorCarro * 1.15) / 30) + String.format("%.2f", valorCarro * 1.15)
			+ "\n36                                                            " + String.format("%.2f                    ", (valorCarro * 1.18) / 36) + String.format("%.2f", valorCarro * 1.18)
			+ "\n47                                                            " + String.format("%.2f                    ", (valorCarro * 1.21) / 42) + String.format("%.2f", valorCarro * 1.21)
			+ "\n48                                                            " + String.format("%.2f                    ", (valorCarro * 1.24) / 48) + String.format("%.2f", valorCarro * 1.24)
			+ "\n54                                                            " + String.format("%.2f                    ", (valorCarro * 1.27) / 54) + String.format("%.2f", valorCarro * 1.27)
			+ "\n60                                                            " + String.format("%.2f                    ", (valorCarro * 1.30) / 60) + String.format("%.2f", valorCarro * 1.30)
			+ "\n\nPreço à vista: " + String.format("%.2f", valorCarro * 0.8));
			
	}
}

