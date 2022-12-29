import javax.swing.JOptionPane;

public class Media {
	public static void main(String args[]) {
	int nota = 0, aprovados = 0;
			
			while (nota >= 0) {
				nota = Integer.parseInt(JOptionPane.showInputDialog("Diga a média do aluno (valor negativo para sair)"));
				if (nota >= 6) {
					aprovados++;
				}
			}
			
			JOptionPane.showMessageDialog(null, "Alunos aprovados: " + aprovados);
			
	}
}

