import javax.swing.JOptionPane;

public class EntradaSaidaWin implements IEntradaSaida{
	
	public String lerTeclado(String s) {
		s = JOptionPane.showInputDialog("");
		return s;
	}
	
	public void apresentar(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
}
