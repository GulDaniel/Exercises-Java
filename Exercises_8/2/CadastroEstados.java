import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroEstados {
	public static void main(String[] args) {
		
		ArrayList<Estados> cadastroestados = new ArrayList(); 
		
		int opc = 0;
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar estado"
					+ "\n2- Pesquisar por nome" + "\n3- Pesquisar por sigla" + "\n4- Limpar cadastro"
							+ "\n5- Limpar tudo" + "\n6- Quantidade de estados"
					+ "\n7- Valores do objeto" + "\n8- Posição do estado"));
			
			if ( opc == 1) {
				String nome, sigla;
				
				nome = JOptionPane.showInputDialog("Diga o nome do estado: ");
				sigla = JOptionPane.showInputDialog("Diga a sigla do estado: ");
				
				cadastroestados.add(new Estados(nome, sigla));
				
			}
			
			if (opc == 2) {
				String verifica;
				verifica = JOptionPane.showInputDialog("Diga o nome exato do estado: ");
				
				for (int i=0; i<cadastroestados.size(); i++) {
					if(cadastroestados.get(i).getNome().equals(verifica)) {
						JOptionPane.showMessageDialog(null, "Nome: " + cadastroestados.get(i).getNome() + 
								"\nSigla: " + cadastroestados.get(i).getSigla());
					}
				}
				
			}
			
			if (opc == 3) {
				String verificasigla;
				verificasigla = JOptionPane.showInputDialog("Diga a sigla exata do estado: ");
				
				for (int i=0; i<cadastroestados.size(); i++) {
					if(cadastroestados.get(i).getSigla().equals(verificasigla)) {
						JOptionPane.showMessageDialog(null, "Nome: " + cadastroestados.get(i).getNome() + 
								"\nSigla: " + cadastroestados.get(i).getSigla());
					}
				}
				
			}
			
			if (opc == 4) {
				String verificadeleta;
				verificadeleta = JOptionPane.showInputDialog("Diga o nome exato do estado: ");
				for (int i=0; i<cadastroestados.size(); i++) {
					if(cadastroestados.get(i).getNome() == verificadeleta) {
						cadastroestados.remove(i);
					}
				}
				
			}
			
			if (opc == 5) {
			
			cadastroestados.clear();
			
			}
			
			if (opc == 6) {
				int tamanho = cadastroestados.size();
				JOptionPane.showMessageDialog(null, "Quantidade de estados: " + tamanho);
			}
			
			if (opc == 7) {
				String verifica;
				verifica = JOptionPane.showInputDialog("Diga o nome exato do estado: ");
				
				for (int i=0; i<cadastroestados.size(); i++) {
					if(cadastroestados.get(i).getNome().equals(verifica)) {
						JOptionPane.showMessageDialog(null, "Nome: " + cadastroestados.get(i).getNome() + 
								"\nSigla: " + cadastroestados.get(i).getSigla());
					}
				}
		
			}
			
			if (opc == 8) {
				String verificasigladois;
				verificasigladois = JOptionPane.showInputDialog("Diga a sigla exata do estado: ");
				
				for (int i=0; i<cadastroestados.size(); i++) {
					if(cadastroestados.get(i).getSigla().equals(verificasigladois)) {
						JOptionPane.showMessageDialog(null, "Posição " + cadastroestados.get(i));
					}
				}
			}
		}
		}
}
