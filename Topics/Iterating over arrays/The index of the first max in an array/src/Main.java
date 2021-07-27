import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        int[] array = new int[elements];

        for (int i = 0; i < elements; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        int index = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }

        System.out.println(index);
    }
}