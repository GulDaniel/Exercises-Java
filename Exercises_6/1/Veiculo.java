public class Veiculo {
	private String chassi; 
	private int ano;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String c, int a) {
		this.chassi = c;
		this.ano = a;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}

