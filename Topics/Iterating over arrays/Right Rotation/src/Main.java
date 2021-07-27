import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int shift = scanner.nextInt();
        shift %= array.length;

        String last;

        for (int x = 0; x < shift; x++) {
            last = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = last;
        }

        for (String s : array) {
            System.out.print(s + " ");
        }

    }

}