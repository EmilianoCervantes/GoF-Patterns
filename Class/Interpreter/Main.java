/*
** Lo que realiza este programa es recibir una cadena de caracteres.
** Posteriormente indica por cada caracter si es una letra o un numero.
** Despues de interpretarlos, les asigna un valor a cada caracter.
** Para finalmente imprimir el patron en el que se metieron los caracteres (con base en tags).
*/

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Lexer lexer = new Lexer();
		System.in.mark(2);
		while(System.in.read() != -1) {
			System.in.reset();
			Token t = lexer.scan();
			System.out.println(t);
			System.in.mark(2);
		}
	}
}