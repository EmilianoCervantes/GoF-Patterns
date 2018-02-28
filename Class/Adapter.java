/* 
** Adapter permite que la interfaz de una clase se pueda utilizar como otra interfaz.
** Hay que definir una clase adaptador que convierta una interfaz en otra que se requiera.
** Se trata de crear un intemediario.
*/

/* 
** En este caso se tiene un lector de ebooks.
** Se realiza la implementación para leer otros textos.
*/

public interface NarradorEbook{
	public void lee(String nombreArchivo, String tipoTexto);
}

public interface NarradorTextos{
	public void leerComic(String nombreArchivo);
	public void leerPoema(String nombreArchivo);
}

public class NarradorComic implements NarradorTextos{
	@Override
	public void leerComic(String nombreArchivo){
		System.out.println("Leyendo el comic llamado "+nombreArchivo);
	}

	@Override
	public void leerPoema(String nombreArchivo){
		//empty
	}
}

public class NarradorPoema implements NarradorTextos{
	@Override
	public void leerComic(String nombreArchivo){
		//empty
	}

	@Override
	public void leerPoema(String nombreArchivo){
		System.out.println("Leyendo el poema titulado "+nombreArchivo);
	}
}

public class EbookAdapter implements NarradorEbook{
	NarradorTextos narradorTextos;

	public EbookAdapter(String tipoTexto){
		if (tipoTexto == "comic") {
			narradorTextos = new NarradorComic();
		} else if (tipoTexto == "poema") {
			narradorTextos = new NarradorPoema();
		}
	}

	@Override
	public void lee(String nombreArchivo, String tipoTexto){
		if (tipoTexto == "comic") {
			narradorTextos.leerComic(nombreArchivo);
		} else if (tipoTexto == "poema") {
			narradorTextos.leerPoema(nombreArchivo);
		}
	}
}

public class Narrador implements NarradorEbook{
	EbookAdapter ebookAdapter;

	@Override
	public void lee(String nombreArchivo, String tipoTexto){
		if (tipoTexto == "ebook") {
			System.out.println("Leyendo el libro titulado "+nombreArchivo);
		} else if (tipoTexto == "comic" || tipoTexto == "poema") {
			ebookAdapter = new EbookAdapter(tipoTexto);
			ebookAdapter.lee(nombreArchivo, tipoTexto);
		} else {
			System.out.println("El "+nombreArchivo+" no fue reconocido.");
		}
	}
}