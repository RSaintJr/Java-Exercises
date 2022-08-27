import java.util.Scanner;
import java.lang.Math;

public class Exec6 {

	public static void main(String[] args) {
		
		Scanner par = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int num = par.nextInt();
		int num2 = Math.floorMod(num,2);
		if(num2 > 0)
		{
			System.out.println("Par: " + (num + 1));
		}
		else
		{
			System.out.println("Impar: " + (num + 1));
		}
		par.close();

	}

}
