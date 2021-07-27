import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] list = new String[8];

        for (int j = 0; j < list.length; j++) {
            list[j] = scanner.next();
        }

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}