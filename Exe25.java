package Lista2;
import java.util.Scanner;
public class ExercicioVinteeCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um numero inteiro: ");
		n = Integer.parseInt(entrada.nextLine());
		
		if (n%2 == 0)
		System.out.println("O númeroinformado é par ");
		else
			System.out.println("o número informado é impar");
		
		entrada.close();
	}
}
