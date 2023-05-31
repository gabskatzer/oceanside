package prueba;

public class Cuadrado implements Figura{
	int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	 public int perimetro() {
		 int result = lado * 4;
		 return result;
	 }
	 
	 public int area() {
		 int result = lado * lado;
		 return result;
	 }

}
