import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int pieces = scanner.nextInt();

        int grid = length * width;
        int segment1 = grid - length;
        int segment2 = grid - width;


        if (pieces <= grid) {
            if (pieces % length == 0 || pieces % width == 0 || pieces % grid == 0 || pieces % segment1 == 0 || pieces % segment2 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        } else {
            out.println("NO");
        }
    }
}