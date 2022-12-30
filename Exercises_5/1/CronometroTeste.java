import javax.swing.JOptionPane;

public class CronometroTeste {
public static void main(String args[]) {

String horario = "";

Cronometro c1 = new Cronometro();
Cronometro c2 = new Cronometro(12, 30);
Cronometro c3 = new Cronometro(16);
Cronometro c4 = new Cronometro(9,6,45);

horario += c1.toString() + "\n" + c2.toString() + "\n" +
		c3.toString() + "\n" + c4.toString();

JOptionPane.showMessageDialog(null, horario);
}
}
