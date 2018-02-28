/*
En Composite podemos consturir objetos robustos con unos más sencillos en
una especie de recursión compositiva. Está implementada de la siguiente manera:
Primero tenemos el archivo Compositor que nos ayuda a guardar objetos dentro de uno
mismo y almacena un costo. El archivo producto no permite asignar un precio a cada
uno. El archivo tienda tiene una lista que almacena los productos y por último el
main que crea los objetos con ayuda de la clase de compositor.
*/

public class Main {
 public static void main(String[] args) {
     Compositor c = new Producto(10);

     System.out.println("Costo de Producto: " + c.getCosto());

     Compositor c2 = new Producto(3);
     Compositor c3 = new Tienda();

     c3.agregarProducto(c);
     c3.agregarProducto(c2);

     System.out.println("Costo total de tienda: " + c3.getCosto());

 }
}
