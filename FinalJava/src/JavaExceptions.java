// Java Exceptions
// When executing Java code, different errors can occur: coding errors made by the programmer,
// errors due to wrong input, or other unforeseeable things.
// When an error occurs, Java will normally stop and generate an error message. The technical term for this is:
// Java will throw an exception (throw an error).
public class JavaExceptions {
    public static void main(String[] args) {
        // Java try and catch
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // This will generate an error
        } catch (Exception e) {
            System.out.println("Something went wrong. Message: " + e.getMessage());
        }

        // Finally
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong. Message: " + e.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        // The throw keyword
        checkAge(20); // No exception will be thrown
        checkAge(15); // Throws an exception if age is below 18
//        checkAge(age);

    }

    // Throw an exception if age is below 18
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
