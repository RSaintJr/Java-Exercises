import java.util.Scanner;

public class Exec12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idad[] = new int[5];
		float alt[] = new float[5];
		int id;
		float altu;
		
		for (int i = 0; i < 5; i++)
		{	
			id = entrada.nextInt();
			altu = entrada.nextInt();
			idad[i] = id;
			alt[i] = altu;
		}
		
		for (int i = 0; i < 5; i++)
		{
			
		}
		
		entrada.close();
	}

}
