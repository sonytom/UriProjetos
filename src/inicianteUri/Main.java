  
/**
 * 
 */
package inicianteUri;

import java.util.Scanner;

/**
 * @author marco
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado;
		double lado;
		Quadrado q1;
		double area;
		
		teclado = new Scanner(System.in);
		lado = teclado.nextDouble();
		teclado.close();
		
		q1 = new Quadrado(lado);
		
		
		area = q1.getArea();
		
		System.out.printf("Area do Quadrado = %.4f\n", area);
		
		area= q1.getDiagonal();
		
		System.out.printf("Diagonal do Quadrado = %.2f\n", area);
		
		
	}

}
