import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        // put your code here
        int boy1 = scanner.nextInt();
        int boy2 = scanner.nextInt();
        int boy3 = scanner.nextInt();

        out.println(((boy1 <= boy2) && (boy2 <= boy3)) || ((boy3 <= boy2) && (boy2 <= boy1)));
    }
}