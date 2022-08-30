import java.util.Scanner;

public class Exec9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = entrada.nextLine();
		
		int k = texto.length();
		
		char nomade[]  = new char[k];
		
		nomade = texto.toCharArray();
		
		for(int i = 0; i < k;i++)
		{
			System.out.println("Texto: " + nomade[i]);
		}
		
		entrada.close();
	}

}