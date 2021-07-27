import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(in);
        int number = scanner.nextInt();

        if ((number > -15 && number <= 12) || (number > 14 && number < 17) || (number >= 19)) {
            out.println("True");
        } else {
            out.println("False");
        }
    }
}