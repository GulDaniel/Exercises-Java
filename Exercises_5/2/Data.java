public class Data {
	
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano) {
		
		if (dia <= 30 && dia >= 1) {
			this.dia = dia; 
		}
		
		if (mes <= 12 && mes >= 1) {
			this.mes = mes;
		}
		
		if (ano >= 1) {
			this.ano = ano;
		}
	}
}
