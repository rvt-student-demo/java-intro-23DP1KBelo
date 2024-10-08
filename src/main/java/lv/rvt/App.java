package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        printStars(5);
        printStars(3);
        printStars(9);

        printSquare(4);

        printRectangle(17, 3);

        printTriangle(4);
        } 
    
    public static void printStars (int number){
        int n = 0;
        while(n < number){
            System.out.print("*");
            n++; 
        }
        System.out.println("");
    }

    public static void printSquare(int size){
      int i = 0;
        while(i < size){
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height){
       int i = 0;
        while(i < height){
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size){
        int i = 1;
        while(i < size + 1){
            printStars(i);
            i++;
        }

    }
        
 }

