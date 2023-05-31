package prueba;

public class Matematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura rectangulo = new Rectangulo(3, 5);
		Figura cuadrado = new Cuadrado(4);
		System.out.println("El perimetro del rectangulo es: " + rectangulo.perimetro());
		System.out.println("El area del rectangulo es: " + rectangulo.area());
		
		System.out.println("El perimetro del cuadrado es: " + cuadrado.perimetro());
		System.out.println("El area del cuadrado es: " + cuadrado.area());

	}

}
