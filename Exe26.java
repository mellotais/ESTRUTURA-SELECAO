package Lista2;
import java.util.Scanner;
public class ExercicioVinteeSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
						
		float n;
		
		System.out.println("Digite um numero: ");
		n = entrada.nextFloat();
		
		if (Math.floor(n) != n)
			System.out.println("é um número decimal");
		else
			System.out.println("é um número inteiro");
		
		entrada.close();
	}
}
