import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        out.println((a + b) == 20 || (b + c) == 20 || (a + c) == 20);
    }
}