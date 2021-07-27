import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        while (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
            if ( (num1 % 4 == 0) && ( num1 > num2) ) {
                num2 = num1;
            }
        }

        System.out.println(num2);
    }
}