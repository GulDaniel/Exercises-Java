import javax.swing.JOptionPane;

public class Eleicao {
	public static void main(String args[]) {
	int opc = -1, total = 0, v1 = 0, v2 = 0, v3 = 0, v4 = 0, branco = 0, nulo = 0;
			
		while (opc != 0) {
		opc = Integer.parseInt(JOptionPane.showInputDialog("Diga seu voto:"
				+ "\n1 para o candidato 1" + "\n2 para o candidato 2"
				+ "\n3 para o candidato 3" + "\n4 para o candidato 4"
				+ "\n5 para anular o voto" + "\n6 para votar em branco"
				+ "\n0 para sair"));

		if (opc != 0) {
			if (opc == 1) {
				v1++;
			}else if (opc == 2) {
				v2++;
			}else if (opc == 3) {
				v3++;
			}else if (opc == 4) {
				v4++;
			}else if (opc == 5) {
				nulo++;
			}else if (opc == 6) {
				branco++;
			}
		
			total++;
		
		double 	v1p = (v1 * 100) / total,
				v2p = (v2 * 100) / total,
				v3p = (v3 * 100) / total, 
				v4p = (v4 * 100) / total,
				brancop = (branco * 100) / total,
				nulop = (nulo * 100) / total;
		
		JOptionPane.showMessageDialog(null, 
				"Candidato 1: " + v1 + " voto(s) " + v1p + "%"
				+ "\nCandidato 2: " + v2 + " voto(s) " + v2p + "%"
				+ "\nCandidato 3: " + v3 + " voto(s) " + v3p + "%"
				+ "\nCandidato 4: " + v4 + " voto(s) " + v4p + "%"
				+ "\nBrancos: " + branco + " voto(s) " + brancop + "%"
				+ "\nNulos: " + nulo + " voto(s) " + nulop + "%"
				+ "\nTotal de votos: " + total);
		
		}
		}
		
	}
}

