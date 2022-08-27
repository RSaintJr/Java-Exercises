import java.util.Scanner;

public class Exec26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n = entrada.nextFloat();
		
		for(int i = 0; i <= 50; i++)
		{
			System.out.println(i + " - " + " R$ " + n * i);
		}
		
		
		entrada.close();
	}

}
