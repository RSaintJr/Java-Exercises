import java.util.Scanner;
import static java.lang.Math.round;

public class Exec16 {

	public static void main(String[] args) {
		Scanner tinta = new Scanner(System.in);
		System.out.print("Informe os metros: ");
		float metro = tinta.nextFloat();
		float lata = metro / 108;
		float dim = 80 * round(lata);
		float dim2 = 25 * round(lata);
		System.out.println("Quantidade de Tintas:" + round(lata));		
		System.out.println("Quantidade Gasta: " + dim);
		System.out.println("Quantidade Gasta Com Galões:" + dim2);
		tinta.close();
	}

}
