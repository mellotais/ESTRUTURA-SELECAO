
// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
// escrever: F - Feminino, M - Masculino.

package Lista2;
import java.util.Scanner;
public class ExercicioTres 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe seu sexo - F/f(feminino) , M/m(masculino):");
		String sexo = teclado.next(); 
		if ("f".equalsIgnoreCase(sexo))
		{
			System.out.println("sexo feminino!");
		}
		else if("m".equalsIgnoreCase(sexo))
		{
			System.out.println("sexo masculino!");
		}
		else
		{
			System.out.println("sexo Invalido!");
		}
		
		teclado.close();
	}

}
