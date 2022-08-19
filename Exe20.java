package Lista2;
import java.util.Scanner;
public class ExercicioVinte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número com 4 digitos");
        int ano = entrada.nextInt();

        if ((ano > 1000) && (ano < 9999)) 
        {
        if ((ano % 400 == 0)&&(ano % 100 == 0))
        {
            System.out.println("Ano é Bissexto");
        }else  if (ano % 4 == 0){
             System.out.println("Ano Bissexto");
        }else {
             System.out.println("Ano não é Bissexto");
               }
        }
        else {
            System.out.println("Número Inválido");
            }
        entrada.close();
	}

}
