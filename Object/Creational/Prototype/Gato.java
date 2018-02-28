public class Gato implements Prototipo {

	String sonido;

	public Gato(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public Prototipo clonar() {
		return new Gato(sonido);
	}

	public String toString() {
		return "Este gato hace " + sonido;
	}
}
