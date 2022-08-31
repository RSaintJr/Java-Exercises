import java.util.Random;
import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {

        int idad[] = new int[30];
        float alt[] = new float[30];
        Random num = new Random();
        int k = 0;
        float media = 0;


        for (int i = 0; i < 30; i++) {

            idad[i] = num.nextInt(100);
            alt[i] = num.nextFloat(3);
            media = alt[i] + media;

        }

        for (int i = 0; i < 30; i++) {

            if (idad[i] > 13)
            {
                if (alt[i] < media / 30)
                {
                    k++;
                }
            }
        }

        System.out.println("Número de alunos com a altura inferior a media: " + k);
    }
}
