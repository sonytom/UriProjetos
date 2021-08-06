package inicianteUri;

/*
 * Direitos Autorais, 2021,Tomás.
 */


/**
 * A classe <code>Quadrado</code> representa a area de um quadrado, e sua diagonal..
 * 
 * @author tomas
 *
 */
public class Quadrado {
	
	/*
	 * 
	 */
	private double lado;
	/**
	 * @SuppressWarnings usado para não gerar warning, getDiagonal()
	 */
	@SuppressWarnings("unused")
	
	private double diagonal;
	/*
	 * 
	 */
	

	/**
	 * Cria um quadrado com o lado <code>lado</code>.
	 * 
	 *  //   @param raio o raio do novo círculo  //
	 * @throws IllegalArgumentException
	 * 			Quando o valor do lado são diferentes
	 */
	public Quadrado(double lado) {
		super();
		if (lado != lado) {
			throw new IllegalArgumentException();
		}
		this.lado = lado;
	}

	/**
	 * @return the lado
	 */
	public double getArea() {
		return lado * lado;
	}
	
	/**
	 * @return the diagonal
	 */
	public double getDiagonal() {
		 return	 diagonal= Math.sqrt((lado * lado) + (lado * lado)); 
		 
	}
	

}

