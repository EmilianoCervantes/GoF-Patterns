public class Calificacion{
  private int numero;

  public Memento guardarMomento(){
    return new Memento(numero);
  }

  public void restaurarMomento(Memento m){
    numero = m.getEstado();
  }

  public int getCalificacion(){
    return numero;
  }

  public void setCalificacion(int numero){
    this.numero = numero;
  }

}
