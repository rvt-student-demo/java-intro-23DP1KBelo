package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = 0;

    Statistics viens= new Statistics();

    while (true){
      if ( i == -1){
         break;
      } else{
        viens.addNumber(i);
        i = Integer.valueOf(scanner.nextLine());
      }
    }

    System.out.println("Sum: " + viens.sum());

  }

}
  