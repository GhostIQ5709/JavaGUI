// Java ArrayList
// The ArrayList class is a resizable array, which can be found in the java.util package.
// The difference between a built-in array and an ArrayList in Java is that the size of an array cannot be modified.
// While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // Import the Collections class
public class JavaArrayList {
    public static void main(String[] args) {
        // Create an ArrayList object called cars that will store strings:
        ArrayList<String> cars = new ArrayList<String>();

        // Add Items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Access an Item
        String firstCar = cars.get(0); // Remember: Array indexes start with 0

        // Change an Item
        cars.set(0, "Opel");

        // Remove an Item
        cars.remove(0);


        // ArrayList Size
        int numOfCars = cars.size();

        // Loop Through an ArrayList
        for (int i = 0; i < numOfCars; i++) {
            System.out.println(cars.get(i));
        }

        // Loop through an ArrayList with the for-each loop
        for (String car : cars) {
            System.out.println(car);
        }

        // Other Types
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int number : myNumbers) {
            System.out.println(number);
        }

        // Sort an ArrayList of Strings
        Collections.sort(cars);
        for (String car : cars) {
            System.out.println(car);
        }

        // To remove all the elements in the ArrayList
        cars.clear();

        // Sort an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(33);
        numbers.add(15);
        numbers.add(20);
        numbers.add(34);
        numbers.add(8);
        numbers.add(12);
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
