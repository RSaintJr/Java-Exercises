import java.util.Scanner;

public class Exec7 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		
		while (num1 < num2 - 1)
		{
			System.out.println((num1 + 1));
			num1++;
		}
		
		
		num.close();
	
	}

}
