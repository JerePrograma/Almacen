package comercio.productos;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private String cantidad;
    private String precio;
    private int valor;

    public Producto(String nombre, String cantidad, String precio, int valor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + " /// " + this.cantidad + " /// " + this.precio + this.valor;
    }

    @Override
    public int compareTo(Producto o) {
        return this.getValor() - o.getValor();
    }
}
