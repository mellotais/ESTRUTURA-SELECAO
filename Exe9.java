
// Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule o peso ideal, utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7
// (h = altura)
// Ao final o algoritmo deve mostrar:
// - Altura, peso e sexo;
// - Peso Ideal;
// - Mensagem se está acima, abaixo ou no peso ideal;

package Lista2;
import java.util.Scanner;
public class ExercicioNove 
{
	public static void main(String[] args)throws java.io.IOException 
	{
	 Scanner ler = new Scanner(System.in);

    char sexo;
    double h, psIdeal;

    System.out.printf("Informe o sexo (M/F): ");
    sexo = (char)System.in.read();

    System.out.printf("Informe a altura (m): ");
    h = ler.nextDouble();

    if ((sexo == 'M') || (sexo == 'm'))
       psIdeal = (72.7 * h) - 58;
    else
       psIdeal = (62.1 * h) - 44.7;

    System.out.printf("\nO Peso Ideal eh: %6.2f kgs.\n", psIdeal);
    
  }

}