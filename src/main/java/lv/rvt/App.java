package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
      int[] valA = {13, -22, 82, 17};
      int[] valB = {0, 0, 0, 0};


      for(int i = 0; i < valA.length; i++){
        valB[i] = 25 - valA[i];
      }

      System.out.println("ValA:" + valA[0] + " " + valA[1]+ " " + valA[2]+ " " + valA[3]);

      System.out.println("ValA:" + valB[0] + " " + valB[1]+ " " + valB[2]+ " " + valB[3]);

      System.out.println("Sum: " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " "+ (valA[3]+valB[3]));
    }
}

  
 

