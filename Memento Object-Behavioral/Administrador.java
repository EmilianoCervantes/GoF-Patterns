import java.util.ArrayList;

public class Administrador{
  private ArrayList<Memento> estados = new ArrayList<Memento>();

  public void agregarMemento(Memento m){
    estados.add(m);
  }

  public Memento obtenerMemento(int index){
    return estados.get(index);
  }
}
