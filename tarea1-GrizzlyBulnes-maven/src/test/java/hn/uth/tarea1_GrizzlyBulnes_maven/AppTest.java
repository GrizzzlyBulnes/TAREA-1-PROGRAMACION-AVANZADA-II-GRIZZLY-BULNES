package hn.uth.tarea1_GrizzlyBulnes_maven;

import org.junit.AfterClass;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;


public class AppTest {
    
	@BeforeClass
    public static void comenzar() {
        System.out.println("Comenzando pruebas...");
    }
    
    @Test
    public void areaCirculo1() {
        assertEquals(App.AreaCirculo(3.0), 28.2744, 0.0001);
    }
    
    @Test
    public void areaCirculo2() {
        assertEquals(App.AreaCirculo(5.0), 78.5398, 0.0001);
    }
    
    @Test
    public void areaCirculo3() {
        assertNull(App.AreaCirculo(-2.0));
    }
    
    @Test
    public void areaCirculo4() {
        assertTrue(App.AreaCirculo(0.0) == null);
    }
    
    
    @Test
    public void areaCuadrado1() {
        assertEquals(81.0, App.AreaCuadrado(9.0), 0.0001);
    }
    
    @Test
    public void areaCuadrado2() {
        assertEquals(56.25, App.AreaCuadrado(7.5), 0.0001);
    }
    
    @Test
    public void areaCuadrado3() {
        assertFalse(20.0 == App.AreaCuadrado(5.0));
    }
    
    @Test
    public void areaCuadrado4() {
        assertNull(App.AreaCuadrado(-242.0));
    }
    
    @Test
    public void areaTriangulo1() {
        assertNull(App.AreaTriangulo(0.0, 7.8));
    }
    
    @Test
    public void areaTriangulo2() {
        assertFalse(10.0 == App.AreaTriangulo(4.2, 3.5));
    }
    
    @Test
    public void areaTriangulo3() {
        assertNotNull(App.AreaTriangulo(9.6, 12.1));
    }
    
    @Test
    public void areaTriangulo4() {
        assertSame(null, App.AreaTriangulo(0.0, 7.8));
    }
    
    @Test
    public void areaRectangulo1() {
        assertFalse(0 == App.AreaRectangulo(4.5, 3.2));
    }
    
    @Test
    public void areaRectangulo2() {
        assertEquals(19.5, App.AreaRectangulo(7.8, 2.5), 0.0001);
    }
    
    @Test
    public void areaRectangulo3() {
        assertEquals(35.88, App.AreaRectangulo(6.9, 5.2), 0.0001);
    }
    
    @AfterClass
    public static void finalizar() {
        System.out.println("Pruebas finalizadas.");
    }
}
