package comercio.productos;

public class ProductoPorUnidad extends Producto {
    private String unidadDeVenta;
    
    public ProductoPorUnidad(String nombre, String unidadDeVenta, int valor) {
        super(nombre, valor);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getValor() + " /// " + this.getUnidadDeVenta() ;
    }
}
