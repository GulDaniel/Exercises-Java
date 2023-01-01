public class Carro extends Veiculo{
	private String montadora;
	private int nPortas;
	
	public Carro() {
		super();
		montadora = "";
		nPortas = 0;
	}
	
	public Carro(String c, int a, String m, int np) {
		super(c, a);
		montadora = m;
		nPortas = np;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}
	
	
}
