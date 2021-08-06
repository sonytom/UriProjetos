package inicianteUri;

//import java.io.IOException;
import java.util.*;

public class Uri1021 {
    public static void main(String args[]) {


    	double valor;
        
        

        Scanner input = new Scanner(System.in);

        valor = input.nextDouble();


        System.out.println("NOTAS:");
        System.out.println("NOTAS:" +valor);
        double n100=0.0;
        double n=0.0;
        while (n>100.0) {
        	if(n>=100.0) {
        		n100=n100 +1;
        		n=n-100.0;
        	}
        	
        }
        System.out.printf("%d nota de 100",n100);
        
        

        input.close();

    }
}
