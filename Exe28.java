package Lista2;
import java.util.Scanner;
public class ExercicioVinteeOito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner imput = new Scanner(System.in);

	    final int TAM = 5;

	    char resposta[] = new char[TAM];
	    int cont        = 0;
	    int totalSim    = 0;

	    System.out.println("\nSuspeito -> Responda com Sim ou Não");

	    System.out.print("Telefonou para a vítima? ");
	    resposta[cont++] = imput.next().toUpperCase().charAt(0);
	    System.out.print("Esteve no local do crime? ");
	    resposta[cont++] = imput.next().toUpperCase().charAt(0);
	    System.out.print("Mora perto da vítima? ");
	    resposta[cont++] = imput.next().toUpperCase().charAt(0);
	    System.out.print("Devia para a vítima? ");
	    resposta[cont++] = imput.next().toUpperCase().charAt(0);
	    System.out.print("Já trabalhou com a vítima? ");
	    resposta[cont++] = imput.next().toUpperCase().charAt(0);

	    System.out.println("\nInformações sobre o Suspeito...\n");
	    for (int i = 0; i < TAM; i++)
	      if (resposta[i] == 'S')
	        totalSim++;

	      switch (totalSim) {
	        case 2:
	          System.out.println("SUSPEITO");
	          break;

	        case 3: case 4:
	          System.out.println("CÚMPLICE");
	          break;

	        case 5:
	          System.out.println("ASSASSINO");
	          break;

	        default:
	          System.out.println("INOCENTE");
	          break;
	      }
	}
}
