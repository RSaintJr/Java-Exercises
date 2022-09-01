import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num = 1;
        int maior = 0;
        int menor = 1000;
        int k = 0;
        int k2 = 0;
        int principal = 0;
        int secundaria = 0;

        boolean fin = false;

        while(!fin)
        {
            num = entrada.nextInt();

            if ( num < 3 || num > 11)
            {
                System.out.println("Invalido");
            }
            else if (num % 2 == 1)
            {
                fin = true;
            }
            else
            {
                System.out.println("Invalido");
            }
        }

        int matriz[][] = new int[num][num];

        num = 0;

        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                matriz[i][j] = entrada.nextInt();
                num = num + matriz[i][j];

                if (matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor)
                {
                    menor = matriz[i][j];
                }

                if (matriz[i][j] % 2 == 0)
                {
                    k++;
                }

                if (matriz[i][j] % 2 == 1)
                {
                    k2++;
                }

                if (i == j)
                {
                    principal += matriz[i][j];
                }

                if ((i + j)  == (num - 1))
                {
                    secundaria += matriz[i][j];
                }
            }
        }




        entrada.close();
    }
}
