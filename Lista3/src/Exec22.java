import java.util.Scanner;

public class Exec22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		char resp;
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Vote !");
			resp = entrada.next().charAt(0);
			
			if (resp == 'a')
			{
				a++;
			}
			
			if (resp == 'b')
			{
				b++;
			}
			
			if (resp == 'c')
			{
				c++;
			}
		}
		
		System.out.println("Votos no Candidato A: " + a);
		System.out.println("Votos no Candidato B: " + b);
		System.out.println("Votos no Candidato C: " + c);
		
		
		entrada.close();
		
		

	}

	
}
