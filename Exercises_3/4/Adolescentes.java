import javax.swing.JOptionPane;

public class Adolescentes {
	public static void main(String args[]) {
	int idade = -1, adolescentes = 0, total = -1;
			double porcentagem;
			
			while (idade != 0) {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Diga a idade (0 para sair): "));
				if (idade < 18 && idade > 13) {
					adolescentes++;
				}
				total++;
			}
			
			porcentagem = (adolescentes * 100) / total;
			
			JOptionPane.showMessageDialog(null, "Porcentagem de adolescentes entre 14-17 anos: " + porcentagem + "%");
			
	}
}

