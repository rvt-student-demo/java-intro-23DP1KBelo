package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
  public static void main(String[] args) {
    Agent bond = new Agent("James", "Bond");

  bond.toString(); // prints nothing
  System.out.println(bond);

  Agent ionic = new Agent("Ionic", "Bond");
  System.out.println(ionic);
  }
  
}