import java.util.Scanner;

public class Exec5 {

	public static void main(String[] args) {
		
		Scanner vogal = new Scanner(System.in);
		System.out.print("Digite a letra em maiusculo: ");
		char letra = vogal.next().charAt(0);
		if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
		{
			System.out.println("Vogal");
		}
		else
		{
			System.out.println("Consoante");
		}
		vogal.close();

	}

}
