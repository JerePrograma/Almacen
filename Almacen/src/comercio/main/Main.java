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
        if (CocaColaZero.compareTo(CocaCola)) {
            if (CocaColaZero.compareTo(ShampooSedal)) {
                if (CocaColaZero.compareTo(Frutillas)) {
                    System.out.println("Producto más caro: " + CocaColaZero.getNombre());
                }else{
                    System.out.println("Producto más caro: " + Frutillas.getNombre());
                }
            }else{
                System.out.println("Producto más caro: " + ShampooSedal.getNombre());
            }
        }else{
            System.out.println("Producto más caro: " + CocaCola.getNombre());
        }
        if (CocaColaZero.compareTo(CocaCola) == false) {
            if (CocaColaZero.compareTo(ShampooSedal)== false) {
                if (CocaColaZero.compareTo(Frutillas)== false) {
                    System.out.println("Producto más barato: " + CocaColaZero.getNombre());
                }else{
                    System.out.println("Producto más barato: " + Frutillas.getNombre());
                }
            }else{
                System.out.println("Producto más barato: " + ShampooSedal.getNombre());
            }
        }else{
            System.out.println("Producto más barato: " + CocaCola.getNombre());
        }
    }
}



