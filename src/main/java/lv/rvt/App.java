package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
  public static void main(String[] args) throws Exception {
    DecreasingCounter counter = new DecreasingCounter(10);
    DecreasingCounter counter1 = new DecreasingCounter();

    counter.decrement();
    counter.decrement();
    counter.increase();

    counter1.increase();
    counter1.increase();
    counter1.increase();

    counter.printValue();
    counter1.printValue();
  }
}
  