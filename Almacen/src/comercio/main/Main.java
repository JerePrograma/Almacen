package comercio.main;

import comercio.productos.Producto;
import comercio.productos.ProductoEnvasado;
import comercio.productos.ProductoPorUnidad;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        ProductoEnvasado cocaColaZero = new ProductoEnvasado("Coca-Cola Zero", "Litros: 1.5", 20);
        ProductoEnvasado cocaCola = new ProductoEnvasado("Coca-Cola", "Litros: 1.5", 18);
        ProductoEnvasado shampooSedal = new ProductoEnvasado("Shampoo Sedal", "Contenido: 500ml", 19);
        ProductoPorUnidad frutillas = new ProductoPorUnidad("Frutillas", "Unidad de venta: kilo", 64);

        productos.add(cocaColaZero);
        productos.add(cocaCola);
        productos.add(shampooSedal);
        productos.add(frutillas);

        for (Producto productos1 : productos) {
            System.out.println(productos1.toString());
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + Collections.max(productos).getNombre());
        System.out.println("Producto más barato: " + Collections.min(productos).getNombre());
    }
}



