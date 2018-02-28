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
