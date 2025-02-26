package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

import lv.rvt.tools.ConsoleColors;

public class App {
    public static void main(String[] args){


        MoneyTest a = new MoneyTest(10,0);
        MoneyTest b = new MoneyTest(5,0);
        
        MoneyTest c = a.plus(b);
        
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        
        a = a.plus(c);          // NB: a new MoneyTestobject is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it
        
        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

    }
}
  