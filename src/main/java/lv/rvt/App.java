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

    Statistics sum= new Statistics();
    Statistics sumOdd= new Statistics();
    Statistics sumEven= new Statistics();


    while (true){
      if ( i == -1){
         break;
      } else{
        sum.addNumber(i);
        i = Integer.valueOf(scanner.nextLine());
        if (i % 2 == 0){
          sumEven.addNumber(i);
        }
        if(i % 2 == 1){
          sumOdd.addNumber(i);
        }
      }
    }

    System.out.println("Sum: " + sum.sum());
    System.out.println("Sum of even number: " + sumEven.sum());
    System.out.println("Sum of odd number: " + sumOdd.sum());

  }

}
  