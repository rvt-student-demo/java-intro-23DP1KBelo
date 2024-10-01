package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        printUntilNumber(5);

        }       
        
    

    public static void printUntilNumber(int number) {
        int i = 1;
        while ( i < number + 1){
            System.out.println(i);
            i ++;
        }
    }

} 
