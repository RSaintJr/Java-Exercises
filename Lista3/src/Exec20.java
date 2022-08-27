import java.util.Scanner;

public class Exec20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int j = entrada.nextInt();
		int n = 0;
		int k = 0;
		int l = 0;
		
		for (int i = 0; i < j; i++)
		{
			n = entrada.nextInt();
			l = l + n;
			k++;
		}
		
		System.out.println("Média: " + (l / k));
		
		entrada.close();
		
		

	}

}
