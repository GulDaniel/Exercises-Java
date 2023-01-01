import javax.swing.JOptionPane;

public class TesteCarro {
	
	public static void main(String args[]) {
	Carro c = new Carro("1234567", 2022, "Volkswagen", 2);
	
	JOptionPane.showMessageDialog(null, "Chassi: " + c.getChassi() + "\nAno: " + c.getAno() +
			"\nMontadora: " + c.getMontadora() + "\nNúmero de portas: " + c.getnPortas());
	}
}
