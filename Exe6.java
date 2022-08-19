
// Faça um Programa que peça um número inteiro e se este número for par, transforme-o
// em impar e vice-versa.

package Lista2;
import java.util.Scanner;
public class ExercicioSeis 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um número");
		int numero = entrada.nextInt();
		
		System.out.println(numero + 1);
		
		entrada.close();
	}
}
