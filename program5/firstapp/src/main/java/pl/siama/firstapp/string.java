package pl.siama.firstapp;

import java.util.Scanner;

public class string
{
    public void Run(Scanner input)
    {
        System.out.println("podaj ciag:");
        String ciag = input.next();
        System.out.println("krórą połowę wyświetlić:");
        int pol = input.nextInt();

        if (pol == 1)
        {
            System.out.println(this.podzial1(ciag));
        }
        if(pol == 2 )
        {
            System.out.println(this.podzial2(ciag));
        }
    }


    private String podzial1(String input)
    {
        int polowa = input.length() / 2;
        String pierwszapol = input.substring(0, polowa);

        return "pierwsza połowa: " + pierwszapol;
    }


    private String podzial2(String input)
    {
        int polowa = input.length() / 2;

        String drugapol = input.substring(polowa);
        return "druga połowa: " + drugapol;
    }


}
