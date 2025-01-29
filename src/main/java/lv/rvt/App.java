package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Box;

public class App {
  public static void main(String[] args){
    student ollie = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    System.out.println(ollie);
    System.out.println("Study credits " + ollie.credit());
    ollie.Study();
    System.out.println("Study credits "+ ollie.credit());
  }
}

  