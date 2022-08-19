// Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
// mesmo é ou não bissexto.

package Lista2;
import java.util.Scanner;
public class ExercicioQuatro 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int ano;
		
		System.out.println("Informe um ano com 4 dígitos");
		ano = teclado.nextInt();
		
		if (ano % 400 == 0)
		{
			System.out.println(ano +"É bissexto");
		}
		else if((ano % 4 == 0) && (ano % 100 != 0))
		{
            System.out.println(ano + " é bissexto.");
        } 
		else
		{
            System.out.println(ano + " não é bissexto");
		}
		
		teclado.close();
	}

}
