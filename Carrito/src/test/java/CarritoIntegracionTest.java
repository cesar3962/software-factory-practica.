/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarritoIntegracionTest {

    @Test
    @DisplayName("Flujo completo: agregar varios, consultar total y vaciar")
    void flujoCompleto_carrito() {
        Carrito carrito = new Carrito();

        
        carrito.agregarProducto(25);
        carrito.agregarProducto(75);
        carrito.agregarProducto(100);

       
        int totalEsperado = 25 + 75 + 100;
        assertEquals(totalEsperado, carrito.obtenerTotal(), "Total tras agregar varios productos");

        
        carrito.vaciar();
        assertEquals(0, carrito.obtenerTotal(), "Total debe ser 0 tras vaciar");
    }
}
