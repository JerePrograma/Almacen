package comercio.productos;

public abstract class Producto implements Comparable<Producto> {
    private String nombre;
    private int valor;

    protected Producto(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Producto o) {
        return this.getValor() - o.getValor();
    }

    @Override
    public abstract String toString();
    
}
