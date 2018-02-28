/*
Este pequeño programa el patrón de diseño de prototipo. El cual nos permite en
la creación clonar objetos en base a los que ya tenemos. Este estilo es útil para crear
copias de nuestros objetos. Para implementarlo creamos una clase prototipa que define un método
general para crear otro objeto. Creamos dos clases: Persona y Gato para demostrar la
funcionalidad de prototipo en diferentes contextos. Y el máin que es donde crea los objetos
principales y solicita su clonación.
*/

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Alfredo");
		System.out.println("P1: " + p1);
		Persona p2 = (Persona)p1.clonar();
		System.out.println("P2: " + p2);

		Gato g1 = new Gato("Miau");
		System.out.println("G1: " + g1);
		Gato g2 = (Gato) g1.clonar();
		System.out.println("G2: " + g2);

	}

}
