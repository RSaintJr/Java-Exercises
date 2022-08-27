import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int n1 = 1;
		int n2 = 1;
		int n3 = num.nextInt();
	
	
		
		for (int i = 1; i <= n3;i++)
		{
			System.out.print( " s " + " = " +  n1 + " / " +  n2);
			n1 = n1 + 1;
			n2 = n2 + 2;
		}
		
		
		num.close();
		
	}

}
