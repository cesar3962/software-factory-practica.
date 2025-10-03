

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Acer
 */

public class CarritoTest {

    private Carrito carrito;

    @BeforeEach
    void setUp() {
        carrito = new Carrito();
    }

    
    @Test
    @DisplayName("agregarProducto suma al total cuando el precio es válido")
    void agregarProducto_valido_incrementaTotal() {
        carrito.agregarProducto(50);
        carrito.agregarProducto(30);
        assertEquals(80, carrito.obtenerTotal(), "El total debe ser la suma de los precios válidos");
    }

    @Test
    @DisplayName("agregarProducto lanza excepción con precio inválido (<=0)")
    void agregarProducto_invalido_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> carrito.agregarProducto(0));
        assertThrows(IllegalArgumentException.class, () -> carrito.agregarProducto(-10));
    }

  
    @Test
    @DisplayName("obtenerTotal inicialmente es 0")
    void obtenerTotal_inicialEsCero() {
        assertEquals(0, carrito.obtenerTotal());
    }

    @Test
    @DisplayName("obtenerTotal refleja suma tras varias adiciones")
    void obtenerTotal_reflejaSuma() {
        carrito.agregarProducto(10);
        carrito.agregarProducto(20);
        assertEquals(30, carrito.obtenerTotal());
    }

   
    @Test
    @DisplayName("vaciar pone el total en 0")
    void vaciar_colocaTotalEnCero() {
        carrito.agregarProducto(100);
        carrito.vaciar();
        assertEquals(0, carrito.obtenerTotal());
    }

    @Test
    @DisplayName("vaciar es idempotente")
    void vaciar_idempotente() {
        carrito.vaciar();
        carrito.vaciar();
        assertEquals(0, carrito.obtenerTotal());
    }
}

