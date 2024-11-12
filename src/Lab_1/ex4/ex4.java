package Lab_1.ex4;

import java.util.Random;

public class ex4 {

    public static void main(String[] args)
        {
            Random random = new Random();
            int num1 = random.nextInt(30) + 1; //folosim random din nou
            int num2 = random.nextInt(30) + 1;

            System.out.println("Numărul 1: " + num1);
            System.out.println("Numărul 2: " + num2);

            int a=num1;
            int b=num2;
            while(b != 0) {
                int r = a % b; //Restul împărțirii lui a la b
                a = b;
                b = r;
            }
            System.out.println("CMMDC este: "+a);
        }
    }

