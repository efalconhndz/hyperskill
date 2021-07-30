import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine()) {
            case "triangle":

                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;

                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));

                break;

            case "rectangle":

                double rectangleArea = 1;

                for (int r = 0; r < 2; r++) {
                    rectangleArea *= scanner.nextDouble();
                }

                System.out.println(rectangleArea);

                break;

            case "circle":

                System.out.println(Math.pow(scanner.nextDouble(), 2) * 3.14);

                break;

            default:

                System.out.println("error!");

                break;
        }
    }
}