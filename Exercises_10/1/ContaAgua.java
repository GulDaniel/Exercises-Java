import javax.swing.JOptionPane;

public class ContaAgua {
	int numero;
	int mes;
	int ano;
	float m3;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getM3() {
		return m3;
	}
	public void setM3(float m3) {
		this.m3 = m3;
	}
	
	public void imprimirDados() {
		JOptionPane.showInternalMessageDialog(null, "numero da conta: " +
	getNumero() + "\nMes: " + getMes() + "\nAno: " + getAno() +
	"\nM3: " + getM3() + "\nValor a ser pago: " + String.format("%.2f", calcularValor()));
	}
	
	public float calcularValor() {
		return m3 * 13.64f;
	}
}
