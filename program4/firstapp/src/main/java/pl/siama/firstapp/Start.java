package pl.siama.firstapp;

import java.util.Scanner;

public class Start
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("liczba wierszy");
        int wiersze = input.nextInt();

        for (int i = 1; i <= wiersze; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}






