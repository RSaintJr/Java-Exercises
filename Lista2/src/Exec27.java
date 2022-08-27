import java.util.Scanner;

public class Exec27 {

	public static void main(String[] args) {
		
		Scanner decin = new Scanner(System.in);
		System.out.println("Digite o número: ");
		float num = decin.nextFloat();
		
		if(Math.round(num) < num || Math.round(num) > num)
		{
			System.out.println("Decimal");
		}
		else
		{
			System.out.println("Inteiro");
		}
		
		
		decin.close();
	}

}
