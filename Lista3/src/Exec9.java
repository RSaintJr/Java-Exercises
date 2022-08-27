import java.util.Scanner;

public class Exec9 {

	public static void main(String[] args) {
		
		Scanner tabu = new Scanner(System.in);
		
		int x = tabu.nextInt();
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(x + " x " + i + " = " + x * i);
		}
		
		tabu.close();
		
		

	}

}
