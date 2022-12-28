import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String args[]) {
    double peso, altura;
		String sexo;
		peso = Double.parseDouble(JOptionPane.showInputDialog("Diga seu peso (Kg):"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Diga sua altura (M):"));
		sexo = JOptionPane.showInputDialog("Diga seu sexo (M/F):");
		if (sexo.equals("M") || sexo.equals("m")) {
			if (peso <= (22.0 * (altura * altura))){
				JOptionPane.showMessageDialog(null, "Dentro do peso ideal.");
			}else {
				JOptionPane.showMessageDialog(null, "Você está gordinho, hein....");
			}
		}else if (sexo.equals("F") || sexo.equals("f")) {
			if (peso <= (20.8 * (altura * altura))) {
				JOptionPane.showMessageDialog(null, "Dentro do peso ideal.");
			}else {
				JOptionPane.showMessageDialog(null, "Você está fofinha, hein...");
			}
		}else {
				JOptionPane.showMessageDialog(null, "Defina-se primeiro!.");
		}
	}
}

