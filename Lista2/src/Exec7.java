import java.util.Scanner;

public class Exec7 {

	public static void main(String[] args) {
		
		Scanner ordem = new Scanner(System.in);
		System.out.print("Informe os números: ");
		int num = ordem.nextInt();
		int num2 = ordem.nextInt();
		int num3 = ordem.nextInt();
		if (num >= num2 || num <= num2)
		{
			if(num > num2 && num2 > num3)
			{
				System.out.print("Ordem: " + num + " " + num2 + " " + num3);
			}
			if(num > num3 && num3 > num2)
			{
				System.out.print("Ordem: " + num + " " + num3 + " " + num2);
			}
			if(num2 > num && num > num3)
			{
				System.out.print("Ordem: " + num2 + " " + num + " " + num3);
			}
			if(num2 > num3 && num3 > num)
			{
				System.out.print("Ordem: " + num2 + " " + num3 + " " + num);
			}
			if(num3 > num && num > num2)
			{
				System.out.print("Ordem: " + num3 + " " + num + " " + num2);
			}
			if(num3 > num2 && num2 > num)
			{
				System.out.print("Ordem: " + num3 + " " + num2 + " " + num);
			}
		}
		
		ordem.close();
	}

}
