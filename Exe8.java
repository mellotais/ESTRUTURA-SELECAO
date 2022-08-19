
// Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
// calcular a média alcançada pelo aluno e apresentar:
// o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// o A mensagem "Reprovado", se a média for menor do que sete;


package Lista2;
import java.util.Scanner;
public class ExercicioOito 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if (media >= 7)
		{
			System.out.println("Aprovado!");
		}
		else 
		{
			System.out.println("Reprovado!");
		}
		entrada.close();
	}
}
