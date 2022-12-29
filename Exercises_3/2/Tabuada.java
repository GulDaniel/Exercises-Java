import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String args[]) {
	int n;
			n = Integer.parseInt(JOptionPane.showInputDialog("Diga o número que deseja saber a tabuada: "));
				JOptionPane.showMessageDialog(null, 
					 n + " X 01" + " = " + n * 1 + "\n" +
					 n + " X 02" + " = " + n * 2 + "\n" +
					 n + " X 03" + " = " + n * 3 + "\n" +
					 n + " X 04" + " = " + n * 4 + "\n" +
					 n + " X 05" + " = " + n * 5 + "\n" +
					 n + " X 06" + " = " + n * 6 + "\n" +
					 n + " X 07" + " = " + n * 7 + "\n" +
					 n + " X 08" + " = " + n * 8 + "\n" +
					 n + " X 09" + " = " + n * 9 + "\n" +
					 n + " X 10" + " = " + n * 10 + "\n"
					);
	}
}

