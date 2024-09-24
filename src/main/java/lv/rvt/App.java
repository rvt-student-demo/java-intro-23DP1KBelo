package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = num; i > 0; i--) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);



      
    }

}
