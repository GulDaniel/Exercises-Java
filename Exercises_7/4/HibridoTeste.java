public class HibridoTeste {

	public static void main(String args[]) {
		Hibrido h1 = new Hibrido();
		h1.setNome("Jipe");
		h1.setFabricante("Volkswagen");
		
		h1.ligar();
		h1.aumentarVelocidade(12);
		h1.modoAereo();
		h1.modoAquatico();
		h1.modoTerrestre();
	}
}
