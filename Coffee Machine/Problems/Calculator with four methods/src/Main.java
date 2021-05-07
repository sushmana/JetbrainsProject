import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        char sign = scan.next().charAt(0);
        long b = scan.nextLong();
        switch (sign) {
            case '+':
                sumTwoNumbers(a, b);
                break;
            case '-':
                subtractTwoNumbers(a, b);
                break;
            case '*':
                multiplyTwoNumbers(a, b);
                break;
            case '/':
                divideTwoNumbers(a, b);
                break;
            default:
                System.out.print("Invalid sign!");
                break;
        }
    }

    public static void subtractTwoNumbers(long a, long b) {
        System.out.print(a - b);
    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.print(a + b);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b != 0) {
            System.out.print(a / b);
        } else {
            System.out.print("Division by 0!");
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        System.out.print(a * b);
    }
}
