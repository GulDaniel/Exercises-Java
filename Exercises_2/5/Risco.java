import javax.swing.JOptionPane;

public class Risco {
    public static void main(String args[]) {
        double peso;
        int idade, grau_risco;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Diga o peso (Kg):"));
        idade = Integer.parseInt(JOptionPane.showInputDialog("Diga a idade:"));
        if (idade <= 20) {
            if (peso <= 60) {
                grau_risco = 9;
            }else if (peso <= 90) {
                grau_risco = 8;
            }else {
                grau_risco = 7;
            }
        }else if (idade <= 50) {
            if (peso <= 60) {
                grau_risco = 6;
            }else if (peso <= 90) {
                grau_risco = 5;
            }else {
                grau_risco = 4;
            }
        }else {
            if (peso <= 60) {
                grau_risco = 3;
            }else if (peso <= 90) {
                grau_risco = 2;
            }else {
                grau_risco = 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Grau de risco: " + grau_risco);
    }
}

