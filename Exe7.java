
// Faça um Programa que leia três números e mostre-os em ordem decrescente.

package Lista2;
import java.util.Scanner;
public class ExercicioSete 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int auxiliar;
		
		System.out.println("Digite um número");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite outro número");
		int numero2 = entrada.nextInt();
		
		System.out.println("Digite um último número");
		int numero3 = entrada.nextInt();
		
		if (numero1 > numero2) 
		{
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }

        if (numero2 > numero3) 
        {
            auxiliar = numero2;
            numero2 = numero3;
            numero3 = auxiliar;
        }
         
        if (numero1 > numero2) 
        {
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }
         System.out.println("Essa é a ordem decrescente: " + numero3 + " " + numero2 + " " + numero1);
         
         entrada.close();
	}
}
