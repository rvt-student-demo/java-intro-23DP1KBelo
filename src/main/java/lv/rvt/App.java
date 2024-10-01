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
        int num = 0;
        int even = 0; 
        System.out.println("Give number: ");
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1){
                break;
            }
            sum += input;
            num++;
            
            if (input % 2 == 0){
                even ++;
            }
            
       }

       System.out.println("Tnx!Bye!");
       System.out.println("Sum: "+ sum);
       System.out.println("Numbers: "+ num);
       System.out.println("Average:" + ((double) sum / num ) );
       System.out.println("Even:" + even);
       System.out.println("Odd:" + ((int)num - even));








      
    }

}
