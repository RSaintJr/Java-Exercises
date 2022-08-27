import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		int numb = num.nextInt();
		
		for (int i = numb - 1; i < numb;i--)
		{
			numb = numb * i;
			if(i == 1)
			{
				break;
			}
		}
		
		System.out.println(numb);
		
		num.close();

	}

}
