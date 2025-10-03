/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Acer
 */
public class Carrito {
    private int total;

    public Carrito() {
        this.total = 0;
    }

    public void agregarProducto(int precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("Precio inválido");
        }
        total += precio;
    }

    public int obtenerTotal() {
        return total;
    }

    public void vaciar() {
        total = 0;
    }
}
