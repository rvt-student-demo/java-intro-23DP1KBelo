package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
  public static void main(String[] args) {
    PaymentCard cardPaul = new PaymentCard(20);
    PaymentCard cardMatt = new PaymentCard(30);
    cardPaul.eatHeartily();
    cardMatt.eatAffordably();

    System.out.println("Paul: " + cardPaul);
    System.out.println("Matt: " + cardMatt);

    cardPaul.addMoney(20);
    cardMatt.eatHeartily();

    System.out.println("Paul: " + cardPaul);
    System.out.println("Matt: " + cardMatt);

    cardPaul.eatAffordably();
    cardPaul.eatAffordably();

    cardMatt.addMoney(50);

    System.out.println("Paul: " + cardPaul);
    System.out.println("Matt: " + cardMatt);



  }

}
  