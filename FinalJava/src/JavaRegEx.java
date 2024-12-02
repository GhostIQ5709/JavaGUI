// What is a Regular Expression?
// A regular expression is a sequence of characters that forms a search pattern.
// When you search for data in a text, you can use this search pattern to describe what you are searching for.
// A regular expression can be a single character, or a more complicated pattern.
// Regular expressions can be used to perform all types of text search and text replace operations.

// Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions.
// The package includes the following classes:
// - Pattern Class: Defines a pattern (to be used in a search)
// - Matcher Class: Used to search for the pattern
// - PatternSyntaxException Class: Indicates syntax error in a regular expression pattern

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegEx {
    public static void main(String[] args) {
        // Example: Find out if there are any occurrences of the word "w3schools" in a sentence
        Pattern pattern = Pattern.compile("w3Schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

// Outputs: Match found

// Flags
// Flags in to compile() method change how the search is performed. Here are a few of them:
// - Pattern.CASE_INSENSITIVE: The case of letters will be ignored when performing a search.
// - Pattern.LITERAL: Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
// - Pattern.UNICODE_CASE: Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside the English alphabet

// Regular Expression Patterns
// The first parameter of the Pattern.compile() method is the pattern. It describes what is being searched for.
// Brackets are used to find a range of characters:
// - [abc]: Find one character from the options between the brackets
// - [^abc]: Find one character NOT between the brackets
// - [0-9]: Find one character from the range 0 to 9

// Metacharacters
// They are characters with a special meaning:
// - |: Find a match for any one of the patterns separated by | as in: cat|dog|fish
// - .: Find just one instance of any character
// - ^: Finds a match as the beginning of a string as in: ^Hello
// - $: Finds a match at the end of the string as in: World$
// - \d: Find a digit
// - \s: Find a whitespace character
// - \b: Find a match at the beginning or end of a word

// Quantifiers
// They define quantities:
// - n+: Matches any string that contains at least one n
// - n*: Matches any string that contains zero or more occurrences of n
// - n?: Matches any string that contains zero or one occurrences of n
// - n{x}: Matches any string that contains a sequence of X n's
// - n{x,y}: Matches any string that contains a sequence of X to Y n's
// - n{x,}: Matches any string that contains a sequence of at least X n's
}
