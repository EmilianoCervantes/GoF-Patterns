public class Persona implements Prototipo {

	String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Prototipo clonar() {
		return new Persona(nombre);
	}

	public String toString() {
		return "Este objeto se llama " + nombre;
	}
}
