import java.util.Scanner;

public class Triangle {
    double a;
    double b;
    double c;



    public void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write value to a");
        a = scanner.nextDouble();
        System.out.println("Write value to b");
        b = scanner.nextDouble();
        System.out.println("Write value to c");
        c = scanner.nextDouble();
        double p = (a + b + c) / 2;

        System.out.println("Area a,b,c =" + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
