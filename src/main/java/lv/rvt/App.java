package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvārdu: ");
        String lastName = scanner.nextLine();

        System.out.println("Ievadiet savu grupu: ");
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + lastName + ", " + "grupa: " + group);

    }

}
