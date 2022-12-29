import javax.swing.JOptionPane;

public class Produtos {
	public static void main(String args[]) {
	double valorProduto = 0, maior = 0, menor = 0, total = 0, soma = 0;
			
			while (total < 15) {
				valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Diga o preço de 15 produtos: "));
				
				if (total == 0) {
					menor = valorProduto;
				}
				
				if (valorProduto < menor) {
					menor = valorProduto;
				}
					
				if (valorProduto > maior) {
					maior = valorProduto;
				}
				
				total++;
				soma += valorProduto;
			}
			
			double media = soma / total;
			
			JOptionPane.showMessageDialog(null, "Maior preço: " + maior
					+ "\nMenor preço: " + menor
					+ "\nMédia dos preços: " + String.format("%.2f", media));
			
	}
}

