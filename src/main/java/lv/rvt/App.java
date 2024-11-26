package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
  public static void main(String[] args) throws Exception {
    BufferedReader reader = Helper.getReader("persons.csv");

    reader.readLine();

    String line;
    while((line = reader.readLine()) != null){
      System.out.println(line);
    }
    
  }
}
  