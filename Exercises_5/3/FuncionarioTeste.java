import javax.swing.JOptionPane;
public class FuncionarioTeste {
	public static void main(String args[]) {
		
		String empresa = "";		

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario("Müller", 25);
		Funcionario f3 = new Funcionario("Olga", 4983, 2200);
		
		empresa += f1.toString() + "\n" +
		f2.toString() + "\n" +
		f3.toString();

		JOptionPane.showMessageDialog(null, empresa);
	}
}
