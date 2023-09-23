package Assignment1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list to store individuals (list and students)
        ArrayList<Person> list = new ArrayList<>();

        // Create and add Instructor objects
        list.add(new Instructor("John Doe", "jone@sfu.ca", "123456789"));
        list.add(new Instructor("Jane Smith", "jane@sfu.ca", "987654321"));

        // Create and add Student objects
        list.add(new Student("Alice Johnson", "alice@sfu.ca", "213476589", "A"));
        list.add(new Student("Bob Wilson", "bob@sfu.ca", "986745231", "B"));

        // Write individuals to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Assignment1/Out.txt"))) {
            for (Person individual : list) {
                writer.write(individual.toString());
                writer.newLine();
            }
            System.out.println("Data has been written to individuals.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
