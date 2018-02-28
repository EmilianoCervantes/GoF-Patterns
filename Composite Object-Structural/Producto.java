public class Producto extends Compositor {

 int costo;

 public Producto(int costo){
  this.costo = costo;
 }

 @Override
 public int getCosto() {
  return this.costo;
 }

 @Override
 public void agregarProducto(Compositor compositor) {}
}
