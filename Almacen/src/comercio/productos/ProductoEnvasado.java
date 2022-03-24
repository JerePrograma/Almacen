package comercio.productos;

public class ProductoEnvasado extends Producto {
    private String volumen;

    public ProductoEnvasado(String nombre, String volumen, int valor) {
        super(nombre, valor);
        this.volumen = volumen;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// " + this.getVolumen() + " /// Precio: $" + this.getValor();
    }
}
