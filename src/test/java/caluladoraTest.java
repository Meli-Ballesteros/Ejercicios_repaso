import model.Ejercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Test;

public class caluladoraTest {

    @Test
    public void  sumatest1(){
        Ejercicios ejercicios = new Ejercicios(); // creo el objeto
        int result =  ejercicios.suma( 2,3);  // se inicaliza y se llama al metodo a necesitar
        assertEquals(5,result); // se escribe el resultado esperado
    }

    @Test
    public void sumarTest2(){
        Ejercicios ejercicios =new Ejercicios();
        int result = ejercicios.suma(5,20);
        assertEquals(25, result);
    }

    @Test
    public void sumaTest3(){
        Ejercicios ejercicios = new Ejercicios();
        int result = ejercicios.suma(10,20);
        assertEquals(30, result);
    }

    @Test
    public void multiplitionTest(){
        Ejercicios ejercicios = new Ejercicios();
        int result = ejercicios.multiplication(5,20);
        assertEquals(100,result);
    }
    @Test
    public void divisionTest(){
        Ejercicios ejercicios = new Ejercicios();
        int result = ejercicios.division(4,2);
        assertEquals(2,result);
    }

    @Test
    public void restaTest(){
        Ejercicios ejercicios = new Ejercicios();
        int result = ejercicios.resta(1,5);
        assertEquals(-4,result);
    }



}
