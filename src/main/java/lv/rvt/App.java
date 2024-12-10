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
    boolean isProgramRunnng = true;
    System.out.println("Welcome to person manager, type \"help\" to see available commands.");

    String userCommand = null;
    while(isProgramRunnng) {
      String command = scanner.nextLine();

      if(command.equals("add")){

          System.out.println("Enter your name: ");
          String name = scanner.nextLine();
      
          System.out.println("Enter your age: ");
          String age = scanner.nextLine();
      
          System.out.println("Enter your weight: ");
          String weight = scanner.nextLine();
      
          System.out.println("Enter your height: ");
          String height = scanner.nextLine();
    
          Person person = new Person(name, Integer.valueOf(age), Double.valueOf(weight), Double.valueOf(height));
          PersonManager.addPerson(person);

          System.out.println("Paldies par reģistrāciju!");

      }else if (command.equals("exit")){
          System.out.println("Thanks, bye bye!");
          isProgramRunnng = false;
      } else if (command.equals("show")){
        ArrayList<Person> persons = PersonManager.getPersonList();

        System.out.println("--------------------------------------------------------");
        System.out.printf(" %-10s |", "Name");
        System.out.printf(" %-4s |", "Age");
        System.out.printf(" %-4s |", "Weight");
        System.out.printf("  %-4s |", "Height");
        System.out.printf(" %-2s |", "Body mass index");
        System.out.println();
          for (Person person : persons){
            System.out.println("--------------------------------------------------------");
            System.out.printf(" %-10s |", person.getName());
            System.out.printf(" %-4d |", person.getAge());
            System.out.printf( " %-6.2f |", person.getWeight());
            System.out.printf(" %-7.2f |", person.getHeight());
            System.out.printf(" %-15.2f |", person.bodyMassIndex());
            System.out.println();

          }
      }else if (command.equals("help")){
        System.out.println("show: parāda visas personas no csv faila");
        System.out.println("add: pievienot personu csv failam");
        System.out.println("exit: aptur programmas darbību");
        System.out.println("help: parāda iespējamās komandas");
      }

      System.out.println("Your command was: " + command);
    }
  }
}
  