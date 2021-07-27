import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int parts = scanner.nextInt();
        int detector = 0;

        int shipped = 0;
        int fixed = 0;
        int rejected = 0;

        for (int i = 0; i < parts; i++) {

            detector = scanner.nextInt();

            if (detector < 0) {
                rejected++;
            } else if ( detector == 0 ) {
                shipped++;
            } else if ( detector > 0 ) {
                fixed++;
            }
        }

        System.out.println(shipped + " " + fixed + " " + rejected);
    }
}