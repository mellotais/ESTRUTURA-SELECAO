
// Faça um Programa que verifique se uma letra digitada é vogal.

package Lista2;
import java.util.Scanner;
public class ExercicioCinco 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		char letra;
		
		System.out.println("Digite uma letra");
		letra = entrada.nextLine().charAt(0);
		
		if (letra == 'a'|| letra == 'e' || letra == 'i' || letra =='o' || letra == 'u')
		{
			System.out.println("É vogal");
		}
		
		entrada.close();
	}

}
