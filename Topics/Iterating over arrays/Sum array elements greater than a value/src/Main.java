import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int count = 0;

        for (int x = 0; x < size; x++) {
            if (nums[x] > n) {
                count += nums[x];
            }
        }

        System.out.println(count);
    }
}