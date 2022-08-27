import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
	
		Scanner valid = new Scanner(System.in);
		String nome = valid.nextLine();
		String senha = valid.nextLine();
		boolean t = false;
		
		while(t == false)
		{
			if(nome.equals(senha))
			{
				System.out.println("Nome igual a senha !!!: ");
				senha = valid.nextLine();
			}
			else
			{
				t = true;
			}
		}
		
		
		valid.close();
		
		
	}

}