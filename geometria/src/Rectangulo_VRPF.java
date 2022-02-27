//versión inicial
/**
 * 
 * @author Víctor Ramón Pardilla Fernández
 * @version 1.2
 */
public class Rectangulo_VRPF extends FiguraGeometrica_VRPF {
	private double l1;
	private double l2;
	
	/**
	 * 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_VRPF(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	
	@Override
	/**
	 * Este método nos devuelve el área
	 * @return área
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * Este método nos devuelve el perímetro
	 * @return perímetro
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
