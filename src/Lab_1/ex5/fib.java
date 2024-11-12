package Lab_1.ex5;

import java.util.Random;

public class fib {
    public static void main(String[] args)
        {
            Random random = new Random();
            int num1 = random.nextInt(20) + 1;

            System.out.println("Numărul 1: " + num1);
            int n=num1;
            if(n == 1) { //Caz particular
                System.out.println("DA");
            } else
            {
                //Generăm șirul Fibonacci pentru a verifica dacă n face parte din șir
                //Îl vom genera cu trei variabile: c = fn, b = fn-1, a = fn-2
                int a = 1, b = 1, c;
                int esteTermenFib = 0; //În caz că nu este termen Fibonacci, să afișăm NU la final
                do {
                    c = a + b;
                    a = b;
                    b = c;
                    if(n == c) { //Este termen Fibonacci
                        esteTermenFib = 1;
                        System.out.println("DA");
                        break;
                    }
                } while(c <= n);
                if(esteTermenFib == 0) { //Nu este termen Fibonacci
                    System.out.println("NU");
                }
            }
        }
}

