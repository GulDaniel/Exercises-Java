public class Hibrido extends Automovel implements IAgua, ITerra, IAr{

	public void ligar() {
		System.out.println("Ligando");
	}

	public void aumentarVelocidade(float vel) {
		System.out.println("Acelerando " + vel + " km/h");
	}

	
	public void modoAereo() {
		System.out.println("Habilitando modo aéreo");
	}

	
	public void modoTerrestre() {
		System.out.println("Habilitando modo terrestre");
	}

	
	public void modoAquatico() {
		System.out.println("Habilitando modo aquático");
	}
}
