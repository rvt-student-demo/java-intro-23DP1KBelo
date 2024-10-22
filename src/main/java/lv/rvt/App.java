package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

       ArrayList<Integer> skaitli = new ArrayList<>();

       int input = 0;
       
       while (true){
            input = Integer.valueOf(scanner.nextLine());   
            if (input == -1){
                break;     
       }
            skaitli.add(input);
    }
    
    System.out.print("From where? ");
    int index1 = Integer.valueOf(scanner.nextLine());

    System.out.print("To where? ");
    int index2 = Integer.valueOf(scanner.nextLine());
       

       while(true){
            if (index1 < 0 || index1 > skaitli.size()){
                System.out.print("From where? ");
                index1 = Integer.valueOf(scanner.nextLine());
            } else if (index2 >= skaitli.size() || index2 <= 0){
                System.out.print("To where? ");
                index2 = Integer.valueOf(scanner.nextLine());
            } else{
                break;
            }
       }

       for( int i = index1; i <= index2; i++ ){
            System.out.println(skaitli.get(i));
       }


       
     }   
}

  
 

