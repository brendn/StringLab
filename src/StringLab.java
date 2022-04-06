/**
 * String & Methods Lab
 * 
 * @author Brendan
 */
public class StringLab {

    public static void main(String[] args) {
        System.out.println(capitalize("blAZes")); //prints Blazes
        System.out.println(wheresWaldo("Striped Waldo!")); //prints 8
        System.out.println(reverse("happy")); //prints yppah
        soLong("bean", "pea"); //prints bean
        soLong("tart", "trap"); //prints tart trap
        letterize("Java"); //prints J a v a (new line for each)
        System.out.println(firstThingsFirst("tree", "pine")); //prints pine tree
        System.out.println(firstThingsFirst("cat", "dog")); //prints cat dog
        afterMath("She aced the mathematics test!"); //prints mathematics test!
        afterMath("My floor mat is so keen!"); //prints dud
    }

    /**
     * If the phrase contains the word math, it prints the rest of the phrase starting with math.
     * If not, it prints “dud”.
     *
     * @param phrase Input phrase
     */
    public static void afterMath(String phrase) {
        int math = phrase.toLowerCase().indexOf("math");
        System.out.println(math == -1 ? "dud" : phrase.substring(math));
    }

    /**
     * Takes a string and prints it backwards
     *
     * @param s Input string to reverse
     * @return The input string reversed
     */
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Prints only the longer of the two strings. If both strings are the same length, print both.
     *
     * @param a First string to compare
     * @param b Seocond string to compare
     */
    public static void soLong(String a, String b) {
        System.out.println(a.length() == b.length() ? a + " " + b : a.length() > b.length() ? a : b);
    }

    /**
     * Takes a word and prints it out one letter per line
     *
     * @param word Input word to print each character from
     */
    public static void letterize(String word) {
        for (char c : word.toCharArray()) {
            System.out.println(c);
        }
    }

    /**
     * Takes two strings, prints the string that comes first alphabetically, then prints the other.
     *
     * @param a First String to compare
     * @param b Second String to compare
     * @return The String that comes first alphabetically, followed by the other.
     */
    public static String firstThingsFirst(String a, String b) {
        return a.compareToIgnoreCase(b) < b.compareToIgnoreCase(a) ? a + " " + b : b + " " + a;
    }

    /**
     * Takes a string and prints the location (index) in the string where the word “Waldo” first appears.
     *
     * @param phrase Input phrase to search for Waldo in
     * @return The index of "Waldo" in the given String
     */
    public static int wheresWaldo(String phrase) {
        return phrase.toLowerCase().indexOf("waldo");
    }

    /**
     * Takes a word and prints it out with the first letter capitalized and all other letters lowercase
     * 
     * @param word Input word to capitalize
     * @return The word with the first letter capitalized and all the remaining letters lowercase
     */
    public static String capitalize(String word) {
        return word.toUpperCase().charAt(0) + word.toLowerCase().substring(1, word.length());
    }
}
