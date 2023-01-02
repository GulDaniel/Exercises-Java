public class Circulo extends Forma{
	
	private float raio;
	
	public float calcularArea() {
		return (float)Math.PI * raio * raio;
	}
	
	public float cacularPerimetro() {
		return (float)Math.PI * raio * 2;
	}
}
