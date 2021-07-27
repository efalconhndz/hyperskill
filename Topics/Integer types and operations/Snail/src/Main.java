import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poleHeight = scanner.nextInt();
        int snailUp = scanner.nextInt();
        int snailDown = scanner.nextInt();
        int location = 0;
        int day = 0;

        do  {
            day++;
            location = location + snailUp;
            if (!(location >= poleHeight)) {
                location = location - snailDown;
            }
        } while (!(location >= poleHeight));

        System.out.println(day);
    }
}