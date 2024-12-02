// Java Iterator
// An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
// It is called an "iterator" because "iterating" is the technical term for looping.
// To use an Iterator, you must import it from the java.util package.

import java.util.ArrayList; // Import the ArrayList class
import java.util.Iterator; // Import the Iterator class
public class JavaIterator {
    public static void main(String[] args) {
        // Getting an Iterator
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        System.out.println("First item: " + it.next());

        // Looping Through a Collection
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Removing Items from a Collection
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> numIterator = numbers.iterator();
        while (numIterator.hasNext()) {
            Integer i = numIterator.next();
            if (i < 10) {
                numIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
