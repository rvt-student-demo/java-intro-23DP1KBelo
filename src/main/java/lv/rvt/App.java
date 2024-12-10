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
    
          for (Person person : persons){
            System.out.println(person);
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
  