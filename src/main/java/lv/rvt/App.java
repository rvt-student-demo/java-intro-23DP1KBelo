package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    PaymentTerminal unicafeExactum = new PaymentTerminal();

    double change = unicafeExactum.eatAffordably(10);
    System.out.println("remaining change " + change);

    change = unicafeExactum.eatAffordably(5);
    System.out.println("remaining change " + change);

    change = unicafeExactum.eatHeartily(4.3);
    System.out.println("remaining change " + change);

    System.out.println(unicafeExactum);
}}
  