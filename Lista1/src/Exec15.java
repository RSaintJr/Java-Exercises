import java.util.Scanner;
import static java.lang.Math.round;

public class Exec15 {

	public static void main(String[] args) {
		
		Scanner tinta = new Scanner(System.in);
		System.out.print("Informe os metros: ");
		float metro = tinta.nextFloat();
		float lata = metro / 54;
		float dim = 80 * round(lata);
		System.out.println("Quantidade gasta: " + dim);
		System.out.println("Latas de tintas necessárias:" + lata);
		tinta.close();

	}

}
