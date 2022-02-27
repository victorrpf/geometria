package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import geometria.Circulo_VRPF;
import org.junit.jupiter.api.Test;

class testCirculo {

	@Test
	void testArea() {
		Circulo_VRPF miCirculo = new Circulo_VRPF(7, "circulo");
		assertEquals(153.9384,miCirculo.area(),0.001);
		assertEquals(43.9824,miCirculo.perimetro(),0.001);
	}
	
	@Test
	void testArea1() {
		Circulo_VRPF miCirculo = new Circulo_VRPF(0, "circulo");
		assertEquals(0,miCirculo.area(),0.001);
		assertEquals(0,miCirculo.perimetro(),0.001);
	}
	
	@Test
	void testArea2() {
		Circulo_VRPF miCirculo = new Circulo_VRPF(-3, "circulo");
		assertEquals(28.2744,miCirculo.area(),0.001);
		assertEquals(18.8496,miCirculo.perimetro(),0.001);
	}


}
