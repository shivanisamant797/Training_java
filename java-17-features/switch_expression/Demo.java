public class Demo {

    public static void main(String[] args) {

        int day = 2;
        String result;

        switch (day) {

            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            default:
                result = "Invalid day";
        }

        System.out.println(result);
    }
}