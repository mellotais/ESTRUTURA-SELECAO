package Lista2;
import java.util.Scanner;
public class ExercicioDezoito {

	public static void main(String[] args) {
	    
		java.util.Scanner imput = new Scanner(System.in);

	    final int TAM = 3;

	    double lado[] = new double[TAM];
	    float resultado = 0;

	    System.out.println("\nLado do triângulo");
	    for (int i = 0; i < TAM; i++) {
	      System.out.printf("Informe lado %d: ", (i + 1));
	      lado[i] = imput.nextInt();
	    }

	    System.out.println("\nTriângulo é...");
	    if (lado[0] == lado[1] && lado[1] == lado[2])
	      System.out.println("\nEquilátero");
	    else
	      if (lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2])
	        System.out.println("\nIsósceles");
	      else
	        System.out.println("\nEscaleno");
	    
	     imput.close();
	}
}
