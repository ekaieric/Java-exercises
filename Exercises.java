import java.util.Scanner;
import java.util.Locale;

public class Exercises {
    public static void main(String[] args) {
        // exercise 01
        // ExerciseOne();
        // ExerciseTwo();
        // ExerciseThree();
        ExerciseFour();
    }

    // -----------------------------------------------------------

    static void ExerciseOne() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("A soma de x e y é");
        System.out.println(x + y);

        sc.close();
    }

    static void ExerciseTwo() {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt();
        double r = 3.14159;
        double a = r * (Math.pow(x, 2));

        System.out.println("A = " + a);

        sc.close();
    }

    static void ExerciseThree() {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diff;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        diff = (a * b - c * d);

        System.out.println("Diferença = " + diff);

        sc.close();
    }

    static void ExerciseFour() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, hours;
        double work, salary;

        num = sc.nextInt();
        hours = sc.nextInt();
        work = sc.nextDouble();

        salary = hours * work;

        System.out.println("Numero = " + num);
        System.out.println("Salário = U$ %.2f%n " + salary);

        sc.close();

    }
}
