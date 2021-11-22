import java.util.Scanner;


public class num2 {


    public static void main(String[] args) {
        float x = 0;
        float n = 0;
        float c ;
        float z = 1;
        float y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;

            }
            else {
                System.out.println("Error type");
                scanner.next();

            }
        }
        System.out.println("Введите значение n: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 15) {
                    break;
                } else {
                    System.out.println("Введите целое число меньше 15");
                    scanner.next();
                }
            }
            else {
                System.out.println("Error type");
                scanner.next();

            }
        }
        scanner.close();
        if (n>=0) {
            for (int i = 1; i <= n; i++) {
                c = x;
                z = z * c;


            }
            System.out.println(z);

        }
        else {
            for (int i = -1; i >= n; i=i-1) {
                c = x;
                z = z * c;
                y = 1/z;

            }
            System.out.println(y);
        }

    }
}