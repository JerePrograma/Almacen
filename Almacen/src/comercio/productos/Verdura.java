package comercio.productos;

public class Verdura extends Producto {
    public Verdura(String nombre, String cantidad, String precio, int valor) {
        super(nombre, cantidad, precio, valor);


    }

    @Override
    public String obtenerDetalles() {
        return "Nombre: " + this.getNombre() + " /// " + this.getPrecio() + this.getValor() + " /// " + this.getCantidad();
    }


}
