package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class App 
{
  public static void main(String[] args) throws Exception {

    // BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);

    Person person = new Person("maija", 20, 30, 40);
    PersonManager.addPerson(person);

  }
}
  