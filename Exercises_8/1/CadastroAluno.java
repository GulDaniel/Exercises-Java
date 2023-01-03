import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroAluno {
	
		public static void main(String[] args) {
			
		ArrayList<Aluno> cadastroalunos = new ArrayList(); 
		
		int opc = 0;
		
		while (opc != 5) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar aluno"
					+ "\n2- Pesquisar por nome" + "\n3- Pesquisar por faixa etária" + "\n4- Limpar cadastro"
							+ "\n5- Sair"));
			
			if ( opc == 1) {
				String nome;
				int idade;
				
				nome = JOptionPane.showInputDialog("Diga o nome do aluno: ");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Diga a idade do aluno: "));
				
				cadastroalunos.add(new Aluno(nome, idade));
				
			}
			
			if (opc == 2) {
				String verifica;
				verifica = JOptionPane.showInputDialog("Diga o nome exato do aluno: ");
				
				for (int i=0; i<cadastroalunos.size(); i++) {
					if(cadastroalunos.get(i).getNome().equals(verifica)) {
						JOptionPane.showMessageDialog(null, "Nome: " + cadastroalunos.get(i).getNome() + 
								"\nIdade: " + cadastroalunos.get(i).getIdade());
					}
				}
				
			}
			
			if (opc == 3) {
				int faixa;
				faixa = Integer.parseInt(JOptionPane.showInputDialog("Diga a idade: "));
				for (int i=0; i<cadastroalunos.size(); i++) {
					if(cadastroalunos.get(i).getIdade() == faixa) {
						JOptionPane.showMessageDialog(null, "Nome: " + cadastroalunos.get(i).getNome() + 
								"\nIdade: " + cadastroalunos.get(i).getIdade());
					}
				}
				
			}
			
			if (opc == 4) {
			
			cadastroalunos.clear();
			
			}
		}
		}
	}
