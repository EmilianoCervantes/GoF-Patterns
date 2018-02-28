import java.util.ArrayList;
import java.util.List;

public class Tienda extends Compositor {

 private int costo = 0;

 private List<Compositor> listaCompositor;

 public Tienda (){
  listaCompositor = new ArrayList<Compositor>();
 }

 @Override
 public int getCosto() {
  return this.costo;
 }

 public void agregarProducto(Compositor compositor){
  this.costo += compositor.getCosto();
  this.listaCompositor.add(compositor);
 }
}
