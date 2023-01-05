import java.util.ArrayList;

public class Country {
	
	private String ISO, name;
	private int pop, dim;
	private ArrayList<Country> frontier = new ArrayList();

public Country(String iSO, String name, int dim) {
	this.ISO = ISO;
	this.name = name;
	this.pop = pop;
	this.dim = dim;
	this.frontier = frontier;
	}

public String getISO() {
	return ISO;
}

public void setISO(String iSO) {
	ISO = iSO;
}

public String getNome() {
	return name;
}

public void setNome(String nome) {
	this.name = nome;
}

public int getPop() {
	return pop;
}

public void setPop(int pop) {
	this.pop = pop;
}

public int getDim() {
	return dim;
}

public void setDim(int dim) {
	this.dim = dim;
}

public String equalCountry(Country country) {
	if (this.getISO().equals(country.getISO())) {
		return this.getNome() + " é igual a(o) " + country.getNome();
	}
	return this.getNome() + " não é igual a(o) " + country.getNome();
}

public String denPop() {
	double popDen = 0;
	popDen = pop/dim;
	return popDen + "pessoas por km quadrado";
}

public String checkFrontier(Country country) {
	if (this.frontier.contains(country)) {
		return this.getNome() + " é limítrofe de " + country.getNome();
	}
	return this.getNome() + " não é limítrofe de " + country.getNome();
}

public ArrayList commonFrontier(Country country) {
	ArrayList<Country> frontierCommon = new ArrayList();
	for (Country c : this.frontier) {
		if (country.frontier.contains(c)) {
			frontierCommon.add(c);
		}
	}
	return frontierCommon;
}
}
