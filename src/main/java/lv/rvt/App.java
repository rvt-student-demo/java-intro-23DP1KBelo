package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       christmasTree(10);
        } 
    
    // Star sign
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

    //Advanced astrology


    public static void printSpaces(int number){
        int n = 0;
        while(n < number){
            System.out.print(" ");
            n++; 
        }
    }

    public static void printTriangleTwo(int size){
        for (int i = 1 ; i<=size ;i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height){

        for(int i = 1; i<= height; i++){
            printSpaces(height - i);
            printStars((i*2)-1);
        }
        for (int i = 0; i<2; i++){
            printSpaces(height-2);
            printStars(3);
        }

    }

        
 }

