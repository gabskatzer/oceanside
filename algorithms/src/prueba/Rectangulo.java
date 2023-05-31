package prueba;

public class Rectangulo implements Figura{

	public int ancho;
	public int largo;
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public Rectangulo(int ancho, int largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", largo=" + largo + "]";
	}
	
	public int area() {
		int result = ancho * largo;
		return result;
	}
	
	public int perimetro() {
		int result = ancho + ancho + largo + largo;
		return result;
	}
	
}
