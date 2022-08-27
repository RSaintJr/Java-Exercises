import java.util.Scanner;

public class Exec11 {

	public static void main(String[] args) {
		
		Scanner turno = new Scanner(System.in);
		System.out.print("Informe o turno em que você estuda (Em maiusculo escreva: M - Matutino, V - Vespertino, N - Noturno): ");
		char t = turno.next().charAt(0);
		if(t == 'M')
		{
			System.out.println("Bom Dia !");
		}
		if(t == 'V')
		{
			System.out.println("Boa Tarde !");
		}
		if(t == 'N')
		{
			System.out.println("Boa Noite !");
		}
		turno.close();
	}

}
