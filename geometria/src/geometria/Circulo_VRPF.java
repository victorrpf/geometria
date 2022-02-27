package geometria;

public class Circulo_VRPF extends FiguraGeometrica_VRPF {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_VRPF(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
        if (radio<0) {
            radio = r*-1;
        }
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
