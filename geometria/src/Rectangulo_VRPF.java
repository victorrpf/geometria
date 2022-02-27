//versi�n inicial
/**
 * 
 * @author V�ctor Ram�n Pardilla Fern�ndez
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
	 * Este m�todo nos devuelve el �rea
	 * @return �rea
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * Este m�todo nos devuelve el per�metro
	 * @return per�metro
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
