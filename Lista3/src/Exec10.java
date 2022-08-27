import java.util.Scanner;

public class Exec10 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		
		
		
		if (num1 == 2)
		{
			for (int i = 1; i < num2; i++)
			{
			num1 = num1 * num1;
			}
			
			System.out.println(num1 / 2);
			
		}
		else
		{
			for (int i = 1; i < num2; i++)
			{
			num1 = num1 * num1;
			}
			
			System.out.println(num1);
		}
		
		
		num.close();
		
	}

}
