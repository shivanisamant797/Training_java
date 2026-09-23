
// Object obj = "Hi";

// if (obj instanceof String) {

//     String s = (String) obj;

//     System.out.println(s);
// }

//Java 17 is just doing that cast for you automatically as part of the pattern match.
public class Demo {

    public static void main(String[] args) {

        Object obj = "Hi";

        if (obj instanceof String s) {
            System.out.println(s);
        }
    }
}