import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int[] numbers = new int[3];
        int counter = 0;

        for ( int i = 0; i < numbers.length; i++ ) {
            numbers[i] = scanner.nextInt();
            if ( numbers[i] > 0 ) {
                counter++;
            }
        }

        if ( counter == 1 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}