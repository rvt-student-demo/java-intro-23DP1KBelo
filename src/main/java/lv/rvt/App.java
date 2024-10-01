package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        divisibleByThreeInRange(3, 6);

        }       
        
    public static void divisibleByThreeInRange( int beginning, int end){
       while (beginning < end+1){
        if(beginning % 3 == 0){
            System.out.println(beginning);
        }
        beginning++;
       }
    }
// Jāpabeidz majās


    

 }

