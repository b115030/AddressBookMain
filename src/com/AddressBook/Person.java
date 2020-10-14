/*
 * Person class to create a Person
 */
package AddressBook;

import java.util.*;
import java.io.*;

class Person {
	boolean e = true;
    String person_firstName, person_lastName, person_houseNumber, person_city, person_state, person_phone, person_zipcode;
    Scanner readIn = new Scanner(System.in);
    Utils util = new Utils();
    Person() throws IOException {
        while(e) {
        	System.out.println("Enter the First Name of the Person");        
        	person_firstName = readIn.next();
        	System.out.println("Enter the Last Name of the Person");
        	person_lastName = readIn.next();
        	e = util.equals(person_firstName, person_lastName);
        }
        System.out.println("Enter the House Number");
        person_houseNumber = readIn.next();
        System.out.println("Enter the Nameo of the City");
        person_city = readIn.next();
        System.out.println("Enter the State");
        person_state = readIn.next();
        System.out.println("Enter the ZIP code");
        person_zipcode = readIn.next();
        System.out.println("Enter the Phone Number ");
        person_phone = readIn.next();
        List < List < String >> personData = Arrays.asList(
            Arrays.asList(person_firstName, person_lastName, person_houseNumber, person_city, person_state, person_zipcode, person_phone)
        );
        FileWriter csvWriter = new FileWriter("src/CSVFiles/AddressBook.csv", true);
        for (List < String > rowData: personData) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }
}