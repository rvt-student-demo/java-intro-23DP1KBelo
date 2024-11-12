package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{

    public static void main(String[] args) throws Exception{
      BufferedReader reader = Utils.getReader("data.csv");
      String line;

      while((line = reader.readLine()) != null ){
        System.out.println(line);
      }
  }

}
  