package paquetePrueba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNumeroEntero {

	// Desde JUnit5 se recomienda que los objetos de prueba sean public o protected, nunca private
	
	public NumeroEntero entero1;
	public NumeroEntero entero2 = new NumeroEntero(4);
	public NumeroEntero entero3 = new NumeroEntero(2);

	// Probamos el metodo Before para rellenar entero1 y ver que funciona, meotodo JUnit
	
	@Before
	public void antesQue(){
		entero1 = new NumeroEntero(1);
	}

	// A partir de aqui, en tests usaremos assertequals para ver que resultado esperamos
	// Y lo comparamos con el resultado esperado
	
    // Comprobamos la suma
	@Test
	public void testSumarNumerosEntero(){
		entero1 = entero1.sumarNumerosEnteros(entero2, entero3);
		assertEquals(6, entero1.getParteEntera(),0);
	}

	// Probamos la resta
	
	@Test
	public void testRestarNumerosEntero(){
		entero1 = entero1.restarNumerosEnteros(entero2, entero3);
		assertEquals(2, entero1.getParteEntera(),0);
	}

    // Probamos la multiplicacion
	
	@Test
	public void testMultiplicarNumerosEntero(){
		entero1 = entero1.multiplicarNumerosEnteros(entero2, entero3);
		assertEquals(8, entero1.getParteEntera(),0);
	}

	// Probamos la division
	
	@Test
	public void testDividirNumerosEntero(){
		entero1 = entero1.dividirNumerosEnteros(entero2, entero3);
		assertEquals(2, entero1.getParteEntera(),0);
	}

}