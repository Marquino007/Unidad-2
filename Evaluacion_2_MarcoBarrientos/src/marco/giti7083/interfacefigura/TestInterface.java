package marco.giti7083.interfacefigura;

import java.util.List;

/**
 * @author MArco
 */
public class TestInterface implements Figura{

	private Cuadrado cuadrado;
	
	private Circulo circulo;

	private Triangulo triangulo;

	public TestInterface(Cuadrado cuadrado, Circulo circulo, Triangulo triangulo) {
		// TODO Auto-generated constructor stub
		this.cuadrado = new Cuadrado();
		this.circulo = new Circulo();
		this.triangulo = new Triangulo();
	}

}
