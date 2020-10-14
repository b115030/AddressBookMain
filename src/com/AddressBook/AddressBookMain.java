/*
 * main code for Address Book Problem 
 */
package AddressBook;

import java.io.*;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        String line = "";
        String splitBy = ",";
        int option;
        Scanner readIn = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. To add a new person \n2. Exit");
                option = readIn.nextInt();
                if (option == 1) {
                    Person person = new Person();
                } 
                else
                    break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader bufferead = new BufferedReader(new FileReader("src/CSVFiles/AddressBook.csv"));

            while ((line = bufferead.readLine()) != null) {
                String[] personData = line.split(splitBy); // use comma as separator  
                System.out.println("First Name= " + personData[0] + ", Last Name= " + personData[1] + ", Address=" + personData[2] + ", City=" + personData[3] + ", State= " + personData[4] + ", Zip Code= " + personData[5] + ", Phone Number= " + personData[6]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
