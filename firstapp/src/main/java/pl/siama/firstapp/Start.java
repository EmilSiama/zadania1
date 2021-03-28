package pl.siama.firstapp;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("pierwsza liczba :");
        int l1 = input.nextInt();
        System.out.println("druga :");
        int l2 = input.nextInt();
        System.out.println("trzecia liczba :");
        int l3 = input.nextInt();
        System.out.println("czwarta :");
        int l4 = input.nextInt();
        System.out.println("piąta liczba :");
        int l5 = input.nextInt();
        System.out.println("szósta :");
        int l6 = input.nextInt();

        int[] tablica = {l1, l2, l3, l4, l5, l6};

        for (int i = 0; i < tablica.length; i++)
        {
            if (i + 2 < tablica.length)
            {
                if (tablica[i] == 1)
                {
                    if (tablica[i + 1] == 2)
                    {
                        if (tablica[i + 2] == 3)
                        {
                            System.out.println("true");
                        }
                            else
                            {
                            System.out.println("false");
                            }

                    }
                }
            }
        }
    }
}


