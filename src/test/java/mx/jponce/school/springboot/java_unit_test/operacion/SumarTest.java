package mx.jponce.school.springboot.java_unit_test.operacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumarTest {

    //assertEquals
    @Test
    void sumarCorrecto() {
        int resultado = Operaciones.sumar(2, 3);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }

    @Test
    void testDecimal(){
        assertEquals(3.33, 10.0/3, 0.01);
    }

    @Test
    void testDecimalMessage(){
        assertEquals(3.3333, 10.0/3,"los decimales no son iguales");
    }






}
