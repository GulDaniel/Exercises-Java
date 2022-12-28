import javax.swing.JOptionPane;

public class Parcelas {
    public static void main(String args[]) {
        double valor, valor_parcela = 0;
        int qtParcelas;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Diga o valor da compra: "));
        qtParcelas = Integer.parseInt(JOptionPane.showInputDialog("Diga a quantidade de parcelas:"));

        switch (qtParcelas) {
            case 1: valor_parcela = valor / qtParcelas;
                    break;

            case 2: valor_parcela = (valor * 1.025) / qtParcela;
                    break;

            case 5: valor_parcela = (valor * 1.045) / qtParcelas;
                    break;

            case 10: valor_parcela = (valor * 1.0845) / qtParcelas;
                     break;

            case 18: valor_parcela = (valor * 1.12) / qtParcelas;
                     break;

            case 24: valor_parcela = (valor * 1.15) / qtParcelas;
                     break;
        }

        JOptionPane.showMessageDialog(null, "Valor de cada parcela com juros: " + valor_parcela);

        break;
    }
}

