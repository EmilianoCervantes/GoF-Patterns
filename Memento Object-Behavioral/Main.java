/*
El patrón Memento permite  guardar el estado de un objeto en algun
momento dado. Para lograrlo hicimos un ejemplo de calificaciones donde
en el administrador tenemos una lista donde guardamos los mementos de los objetos
calificación y en el main podemos ver que se guardan las calificaciones.
*/


public class Main{
  public static void main(String [] args){
    Administrador admin = new Administrador();

    Calificacion c = new Calificacion();
    c.setCalificacion(10);
    c.setCalificacion(8);

    admin.agregarMemento(c.guardarMomento());

    c.setCalificacion(9);

    admin.agregarMemento(c.guardarMomento());

    Memento m1 = admin.obtenerMemento(0);
    Memento m2 = admin.obtenerMemento(1);

    System.out.println("Calificacion Guardada:" + m1.getEstado());
    System.out.println("Calificacion Guardada:" + m2.getEstado());
  }
}
