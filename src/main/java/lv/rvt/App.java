package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
         int sum = 0;
         int numSk = 0;

        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0){
                sum = sum + number;
                numSk = numSk + 1;
            }

            if (number < 0){
                sum = sum + number;
                numSk = numSk + 1;  
            }

            if (number == 0){
                break;
            }
        }
        System.out.println("Number of numbers:" + numSk);
        System.out.println("Sum of the numbers:" + sum);



       
    }

}
