package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
    public static void main(String[] args) throws Exception {
      BufferedReader reader = Utils.getReader("persons.csv");
      ArrayList<Person> persons = new ArrayList<>();

      String line;
      // Ignore title row
      reader.readLine();

      while((line = reader.readLine())!= null) {
        String[] parts = line.split(", ");


        // {name, age, weight, height} masīvs
        Person person = new Person(
          parts[0],
           Integer.valueOf(parts[1]), 
           Integer.valueOf(parts[2]), 
           Integer.valueOf(parts[3])
          );
          persons.add(person);
      }

      for (Person person : persons) {
        System.out.println(person);
      }
  }
}
  