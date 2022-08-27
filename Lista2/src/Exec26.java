import java.util.Scanner;

public class Exec26 {

	public static void main(String[] args) {
		
		Scanner par = new Scanner(System.in);
		System.out.println("Digite o número: ");
		int num = par.nextInt();
		
		if(num % 2 == 1)
		{
			System.out.println("Impar !");
		}
		else
		{
			System.out.println("Par");
		}
		
		par.close();

	}

}
