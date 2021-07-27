import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int len = scanner.nextInt();
        int numbers[] = new int[len];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int val: numbers){
            sum += val;
        }

        System.out.println(sum);
    }
}