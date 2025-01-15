package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Box;

public class App {
  public static void main(String[] args){
      box box = new box(2.5, 5.0, 6.0);

      System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
      System.out.println( "topArea: "  + box.topArea() );
      box box2 = new box(box);

      System.out.println(box.height() + " " + box2.height());
      box box3 = box2.biggerBox(box2);
      System.out.println(box3.lenght());
      System.out.println(box.lenght());
      System.out.println(box2.height());

      System.out.println("");
      System.out.println(box.nests(box3));

      
  }
}

  