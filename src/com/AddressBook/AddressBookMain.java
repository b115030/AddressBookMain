/*
 * main code for Address Book Problem 
 */
package AddressBook;

import java.io.*;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {


        int option;
        Scanner readIn = new Scanner(System.in);
        try {
            Utils util = new Utils();
            System.out.println("1. To add a new person \n2. To update a person \n3. Exit");
            option = readIn.nextInt();
            switch (option) {
                case 1:
                    Person person = new Person();
                    util.showAddressBook();
                    break;
                case 2:
                    util.showAddressBook();
                    util.updatePerson();
                    util.showAddressBook();
                    break;

                case 3:
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
