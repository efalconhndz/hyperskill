import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        int[] numbers = new int[input2.length()];

        for (int i = 0; i <= 1; i++) {
            numbers[i] = Integer.parseInt(input2.split(" ")[i]);
        }

        System.out.println(input1.substring(numbers[0], numbers[1] + 1));
    }
}