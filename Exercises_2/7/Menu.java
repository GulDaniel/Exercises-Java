import javax.swing.JOptionPane;

public class Menu {
    public static void main(String args[]) {
        int opc = 0;

        opc = Integer.parseInt(JOptionPane.showInputDialog("1- Nome\n2- Idade\n3- Nacionalidade\n4- Sair"));

        switch (opc) {

            case 1:
                String nome;
                nome = JOptionPane.showInputDialog("Diga seu nome: ");
                JOptionPane.showMessageDialog(null,"Bem vindo/a " + nome + "!");
                break;

            case 2:
                int idade;
                idade = Integer.parseInt(JOptionPane.showInputDialog("Diga sua idade:"));

                if (idade >= 18) {
                    JOptionPane.showMessageDialog(null, "Maior de 18 anos.");
                }else {
                    JOptionPane.showMessageDialog(null, "Menor de 18 anos.");
                }
                break;

            case 3: 
                String nacionalidade;
                nacionalidade = JOptionPane.showInputDialog("Diga sua nacionalidade: ");
                if (nacionalidade.equals("brasileiro")|| nacionalidade.equals("brasileira") || nacionalidade.equals("Brasileiro") || nacionalidade.equals("Brasileira")) {
                    JOptionPane.showMessageDialog(null, "Parabéns, você é " + nacionalidade + "!");
                }else {
                    JOptionPane.showMessageDialog(null, "Você é " + nacionalidade + ".");
                }
                break;
        }
    }
}

