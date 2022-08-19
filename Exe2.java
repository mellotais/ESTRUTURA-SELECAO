
// Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo ou zero.

package Lista2;
import java.util.Scanner;

public class ExercicioDois 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		float valor = entrada.nextFloat();
		
		if (valor > 0)
		{
		System.out.println("Positivo");
		}
		if (valor < 0)
		{
		System.out.println("Negativo");
		}
		if (valor == 0)
		{
		System.out.println("Zero");
		}
		entrada.close();
	}
}
