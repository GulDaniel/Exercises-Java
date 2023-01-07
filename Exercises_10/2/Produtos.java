import javax.swing.JOptionPane;

public class Produtos {
	public static void main(String[] args) {
		
		double valor, novo_valor = 0, taxa = 0, valorTaxa = 0, desconto = 0;
		int categoria;
		String tipo, classificacao = "";
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Diga o preço do produto: "));
		categoria = Integer.parseInt(JOptionPane.showInputDialog("Diga a categoria do produto: " +
		"\n1- limpeza\n2- alimentação\n3- vestuário"));
		tipo = JOptionPane.showInputDialog("Diga a situação do produto: " +
		"\nR (refrigeração) - N (não necessita refrigeração)");
		
		if (valor <= 25) {
			if (categoria == 1) {
				taxa = 0.05;
			}else if (categoria == 2) {
				taxa = 0.08;
			}else if (categoria == 3) {
				taxa = 0.1;
			}
		}
		
		if (valor > 25) {
			if (categoria == 1) {
				taxa = 0.12;
			}else if (categoria == 2) {
				taxa = 0.15;
			}else if (categoria == 3) {
				taxa = 0.18;
			}
		}
		
		if (categoria == 2 && tipo.toUpperCase().equals("R")) {
			desconto = valor * 0.05;
		}else {
			desconto = valor * 0.08;
		}
		
		valorTaxa = valor * taxa;
		novo_valor = valor + valorTaxa - desconto;
		
		if (novo_valor <= 50) {
			classificacao = "Barato";
		}else if (novo_valor <= 120) {
			classificacao = "Normal";
		}else {
			classificacao = "Caro";
		}
		
		JOptionPane.showMessageDialog(null, "Valor do aumento: " + String.format("%.2f", valorTaxa) +
			 "\nDesconto: " + String.format("%.2f", desconto) +
			 "\nNovo preço: " + novo_valor + "\nClassificação: " + classificacao)	;
}
}
