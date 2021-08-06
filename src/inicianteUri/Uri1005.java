package inicianteUri;

//import java.io.IOException;
import java.util.*;

public class Uri1005 {
    public static void main(String args[]) {


    	double a;
        double b;
        double media;
        
       

        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();


        media = (a*3.5 + b*7.5) / 11; 

        System.out.println(String.format("MEDIA = %.5f", media));

        input.close();

    }
}