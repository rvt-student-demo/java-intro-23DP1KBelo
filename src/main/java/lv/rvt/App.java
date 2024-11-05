package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
  public static void main( String[] args ){
    
    Person per1 = new Person("John");

    per1.printPerson();
    for(int i = 0; i<35 ; i++){
      per1.growOlder();
    }
    per1.printPerson();
  }
}