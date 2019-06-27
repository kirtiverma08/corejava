
/** This class demonstrates using string methods.
  
  */

class StringsMethods {

    /** Constructor. */

    protected StringsMethods() {
    }

    /** This variable stores a string value. */
    private String firstString = "This is a new String";

    /** This variable stores another string value. */
    private String secondString = "This is a new String";

    /** This variable stores the concatenated string. */
    private String concatString;

    /** This variable stores the replaced string. */
    private String replacedString;

     /** This variable stores a boolean value. */
    private boolean equal;

    /** This method checks equality of strings, concatenates and
                   replace characters. */

    void test() {
        equal = firstString.equals(secondString);
        concatString = "The appendage will come behind me "
                      .concat(secondString);
        replacedString = firstString.replace('i', 'z');
    }

    /** This method displays the results of the functions performed. */

    void print() {

        System.out.println("The concatenated value: " + concatString);
        System.out.println("Replacing i's with z's: " + replacedString);

        if (equal) {
             System.out.println("The two strings are equal");
        } else {
             System.out.println("The strings are not equal");
        }
    }

/** This is a main method.
  * It creates object of the class and accesses its methods
  * @param args passed to the main method
  */

    public static void main(final String []args) {
        StringsMethods objString = new StringsMethods();
        objString.test();
        objString.print();
    }
}
