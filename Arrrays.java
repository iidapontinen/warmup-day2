import java.util.Scanner;

//testing version control

public class Arrrays {

    private static final int MAX_ALLOWED_ATTEMPTS = 3; // new comment

    public static void main(String[] args) {
        int attempts = 1;

        String[] stringInputs = {"", "", ""};
        int[] numberInputs = {0, 0, 0};

        while (attempts <= MAX_ALLOWED_ATTEMPTS) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Give an element: " + ". This is " + attempts + ". attempt.");
            String userInput = scanner.nextLine();

            int number = 0;
            String input = "";
            boolean itIsNotANumber = false;

            try {
                number = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                itIsNotANumber = true;
            }

            if (!itIsNotANumber) {
                numberInputs[attempts-1] = number;
            } else {
                stringInputs[attempts-1] = userInput;
            }

            attempts++;
        }

        // after looping print all the arrays

        String strings = "";
        int numbers = 0;
        StringBuilder stringB = new StringBuilder();

        for (String s : stringInputs) {
            // strings = strings + s, the same as: strings += s  -->   immutable
            stringB.append(s);  // mutable
        }
        for (int i : numberInputs) {
            numbers += i;
        }

        System.out.println(stringB);
        System.out.println(numbers);
    }
}


//    private static final int MAX_ALLOWED_ATTEMPTS = 3;
//
//    public static void main(String[] args) { //static method
//
//        String[] strings = {"", "", ""};
//        int[] numbers = {0, 0, 0};
//        int attempts = 1;
//
//        while (attempts <= MAX_ALLOWED_ATTEMPTS) {
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Give input (attempt: " + attempts + ")");
//            String userInput = scanner.nextLine();
//
//            int number = 0;
//            String string = "";
//            boolean itIsNotANumber = false;
//
//
//            try {
//                number = Integer.parseInt(userInput);
//            } catch (NumberFormatException e) {
//                itIsNotANumber = true;
//            }
//
//            if (!itIsNotANumber) {
//                numbers[attempts - 1] = number;
//            } else {
//                strings[attempts - 1] = userInput;
//            }
//
//            attempts++;
//
//        }
//
//            //finished looping, ready to print arrays
//
//        String stringsConcatenated = "";
//        int numbersSummed = 0;
//        StringBuilder stringBuilder = new StringBuilder();
//
//            for (String s : strings) {
//                //stringsConcatenated += s; //immutable
//                stringBuilder.append(s); //mutable
//            }
//
//            for (int n : numbers) {
//                numbersSummed += n;
//            }
//
//        System.out.println(stringsConcatenated);
//        System.out.println(numbersSummed);
//
//        }
//    }


