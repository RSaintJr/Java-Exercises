import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		
		while(num <= 0 || num >= 10)
		{
			System.out.println("N�mero Invalido");
			num = entrada.nextInt();
		}
		
		
		entrada.close();
	}

}
