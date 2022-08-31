import java.util.Scanner;

public class Exec15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int k = 5;

        int num[] = new int[k];

        for (int i = 0; i < k; i++)
        {
            num[i] = entrada.nextInt();

            while(num[i] > 20 || num[i] < 0)
            {
                num[i] = entrada.nextInt();
            }

            for (int j = 0; j < num[i]; j++)
            {
                System.out.print("#");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        entrada.close();
    }
}
