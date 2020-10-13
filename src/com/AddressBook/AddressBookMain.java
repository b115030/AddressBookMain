/*
 * main code for Address Book Problem 
 */
package AddressBook;

import java.io.*;

public class AddressBookMain {
	public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        try {
            Person person = new Person();
        } catch (IOException e) {
            e.printStackTrace();
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
