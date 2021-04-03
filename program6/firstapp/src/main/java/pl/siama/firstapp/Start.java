package pl.siama.firstapp;

import java.util.Scanner;

public class Start
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj 3 liczby do tablicy:");
        int l1 = input.nextInt();
        int l2 = input.nextInt();
        int l3 = input.nextInt();

        int[] tab =new int[] {l1, l2, l3};
        int[] odwr = new int[tab.length];
        System.out.println();

        for (int i = 0; i < tab.length; i++)
            {
            System.out.print(tab[i] + " ");
            }
        System.out.println();
        for (int i = 0; i < tab.length; i++)
            {
            odwr[i] = tab[tab.length - 1 - i];
            }


        for (int i = 0; i < odwr.length; i++)
            {
            System.out.print(odwr[i] + " ");
            }


    }

}







