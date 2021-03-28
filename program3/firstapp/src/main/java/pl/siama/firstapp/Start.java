package pl.siama.firstapp;

import java.util.Scanner;

public class Start
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bok a:");
        int a = input.nextInt();
        System.out.println("bok b:");
        int b = input.nextInt();
        System.out.println("bok c:");
        int c = input.nextInt();

        if (c > b)
        {
            if (c > a)
            {
                int przyp = (a * a) + (b * b);
                int przeciwp = (c * c);

                if (przyp == przeciwp)
                {
                    System.out.println("zgadza się, to trójkąt prostokątny!");
                }
                if (przyp != przeciwp)
                {
                    System.out.println("to nie jest trójkąt prostokątny!");
                }


            }
        }

        if (b > c)
        {
            if (b > a)
            {
                int przyp = (a * a) + (c * c);
                int przeciwp = (b * b);

                if (przyp == przeciwp)
                {
                    System.out.println("zgadza się, to trójkąt prostokątny!");
                }
                if (przyp != przeciwp)
                {
                    System.out.println("to nie jest trójkąt prostokątny!");
                }


            }
        }
        if (a > b)
        {
            if (a > c)
            {
                int przyp = (c * c) + (b * b);
                int przeciwp = (a * a);

                if (przyp == przeciwp)
                {
                    System.out.println("zgadza się, to trójkąt prostokątny!");
                }
                if (przyp != przeciwp)
                {
                    System.out.println("to nie jest trójkąt prostokątny!");
                }



            }

        }

    }
}






