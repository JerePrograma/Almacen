package comercio.main;

import comercio.productos.Producto;
import comercio.productos.Verdura;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto CocaColaZero = new Producto("Coca-Cola Zero", "Litros: 1.5", "Precio: ", 20);
        Producto CocaCola = new Producto("Coca-Cola", "Litros: 1.5", "Precio: " , 18);
        Producto ShampooSedal = new Producto("Shampoo Sedal", "Contenido: 500ml", "Precio: ", 19);
        Verdura Frutillas = new Verdura("Frutillas", "Unidad de venta: kilo", "Precio: ", 64);

        productos.add(CocaColaZero);
        productos.add(CocaCola);
        productos.add(ShampooSedal);
        productos.add(Frutillas);

        for (Producto productos1 : productos) {
            System.out.println(productos1.obtenerDetalles());
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + Collections.max(productos).getNombre());
        System.out.println("Producto más barato: " + Collections.min(productos).getNombre());
    }
}



