
// Faça um Programa que peça dois números e imprima o maior deles.

package Lista2;
import java.util.Scanner;

public class ExercicioUm 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite um número");
		float primeiro = entrada.nextFloat();
		
		System.out.println("Digite o segundo número");
		float segundo = entrada.nextFloat(); 
		
		if (segundo > primeiro)
		{
			System.out.println("O maior número é:" + segundo); 
		}
		else 
		{
			System.out.println("O maior número é:" + primeiro);
		}
		entrada.close();
	}
}
