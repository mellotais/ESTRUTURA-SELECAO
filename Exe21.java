package Lista2;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
public class ExercicioVinteeUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imput = new Scanner(System.in);
		
	    DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("dd/mm/aaaa").withResolverStyle(ResolverStyle.STRICT);

	    String data = "";

	    System.out.println("\nData válida\n");
	    System.out.print("Informe data (dd/mm/aaaa): ");
	    data = imput.nextLine().trim();

	    try {
	      LocalDate d = LocalDate.parse(data, dtformat);
	      System.out.println("Data válida!!!\n");
	    } catch (DateTimeParseException ex) {
	      System.out.println("Data não válida!!!\n");
	    }
	}

}
