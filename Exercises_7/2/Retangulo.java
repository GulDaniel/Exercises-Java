public class Retangulo extends Forma{

	private float lado, altura;
	
	public float calcularArea() {
		return lado * altura;
	}
	public float cacularPerimetro() {
		return (2 * lado) + (2 * altura);
	}
}
