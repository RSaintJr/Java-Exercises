import java.util.Scanner;

public class Exec8 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int x = 0;
		
		while (num1 < num2 - 1)
		{
			System.out.println((num1 + 1));
			x = x + num1 + 1;
			num1++;
		}
		
		System.out.println("Soma: " + x);
		
		
		num.close();
	

	}

}
