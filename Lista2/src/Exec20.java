import java.util.Scanner;
import java.time.Year;

public class Exec20 {

	public static void main(String[] args) {
		
		Scanner ano = new Scanner(System.in);
		System.out.println("Informe o ano: ");
		int data = ano.nextInt();
		if((Year.isLeap(data) == true))
		{
			System.out.println("Bissexto");
		}
		else
		{
			System.out.println("Não é Bissexto");
		}
		ano.close();
	}
}
