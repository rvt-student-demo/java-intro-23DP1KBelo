package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);
        
        student ollie = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        
        int i = 0;
        while (i < 25) {
          ollie.study();
          i = i + 1;
        }
        System.out.println(ollie);
  }
}
  