package Lista2;
import java.util.Scanner;
public class ExercicioQuatorze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

	    System.out.println("Digite um valor: ");
	    int Diasemana;
	    
	    Diasemana = scan.nextInt();
	    if (Diasemana <1 || Diasemana >7) {
	        System.out.println("Valor invalido! ");
	    }
	    switch (Diasemana) {
	    case 1: 
	        System.out.println("1-Domingo ");
	    break;
	    case 2:
	        System.out.println("2-Segunda ");
	    break;
	    case 3: 
	        System.out.println("3-Terça-Feira ");
	    break;
	    case 4:
	        System.out.println("4-Quarta-Feira ");
	    break;
	    case 5:
	        System.out.println("5-Quinta-Feira ");
	    break;
	    case 6: 
	        System.out.println("Sexta-Feira ");
	    break;
	    case 7:
	        System.out.println("Sabado");
	    break;
	    }

	    scan.close();
	    }
	}

