package pl.siama.firstapp;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("pierwsza temperatura :");
        int t1 = input.nextInt();
        System.out.println("druga temperatura:");
        int t2 = input.nextInt();

        if (t1 < 100 || t2 < 100)
        {
            System.out.println("true");
        }
        else
            {
                System.out.println("false");
            }

    }
}


