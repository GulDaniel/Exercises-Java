public class Fatura {
	
	int numFat, qntCompra;
	float valorProd;
	String descFat;

	public int getNumFat() {
		return numFat;
	}

	public void setNumFat(int numFat) {
		this.numFat = numFat;
	}

	public int getQntCompra() {
		return qntCompra;
	}

	public void setQntCompra(int qntCompra) {
		this.qntCompra = qntCompra;
	}

	public float getValorProd() {
		return valorProd;
	}

	public void setValorProd(float valorProd) {
		this.valorProd = valorProd;
	}

	public String getDescFat() {
		return descFat;
	}

	public void setDescFat(String descFat) {
		this.descFat = descFat;
	}
	
	public double calculaFatura() {
		double totalFat = qntCompra * valorProd;
		return totalFat;
	}
	
	public double somaFatura(Fatura fatura) {
		double valorTotal;
		valorTotal = this.calculaFatura() + fatura.calculaFatura();
		return valorTotal;
	}
	
	public void aplicaDesconto(int desconto) {
		valorProd -= desconto;
	}
}
