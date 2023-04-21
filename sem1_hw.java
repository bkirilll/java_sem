import java.util.Scanner;

public class sem1_hw {
    public static void main(String[] args) {
        ex5();
    }

    static void ex1() {
        System.out.println("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("Треугольное число: %d\n", n * (n + 1) / 2);

    }

    static void ex2() {
        System.out.println("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.printf("n!:  %d\n", factorial);
    }

    static void ex3() {
        int i, j;
        boolean check;

        for (i = 2; i < 1000; i++) {
            check = true;

            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.println(i);
            }

        }

    }

    static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println(("Введите требуемую операцию: "));
        String oper = scanner.next();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int result = 0;
        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
            case "%":
                result = num1 % num2;
                break;
            default:
        }
        System.out.printf("%d %s %d = %d", num1, oper, num2, result);
    }

    static void ex5() {




        
    }



}