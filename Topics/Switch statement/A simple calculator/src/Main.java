import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] equation = new String[3];

        for (int i = 0; i < equation.length; i++) {
            equation[i] = scanner.next();
        }

        switch (equation[1]) {
            case "+":
                System.out.println(Long.parseLong(equation[0]) + Long.parseLong(equation[2]));
                break;
            case "-":
                System.out.println(Long.parseLong(equation[0]) - Long.parseLong(equation[2]));
                break;
            case "*":
                System.out.println(Long.parseLong(equation[0]) * Long.parseLong(equation[2]));
                break;
            case "/":
                if (Integer.parseInt(equation[2]) == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(Long.parseLong(equation[0]) / Long.parseLong(equation[2]));
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}