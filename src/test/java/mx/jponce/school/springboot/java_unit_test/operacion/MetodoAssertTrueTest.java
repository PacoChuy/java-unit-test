package mx.jponce.school.springboot.java_unit_test.operacion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetodoAssertTrueTest {

    @Test
    void test1() {
        assertTrue(true);
    }

    @Test
    void test2(){
        assertTrue("hola".contains("h"));
    }
    @Test
    void test3(){
        assertTrue("ola".contains("h"), "no contiene h");
    }
    @Test
    void test4(){
        int x=3;
        boolean esPar = x % 2 == 0;
        assertTrue(esPar);
    }
}
