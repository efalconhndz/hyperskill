import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String[] lines = new String[2];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
        }

        if (lines[0].replaceAll("\\s", "").equals(lines[1].replaceAll("\\s", ""))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}