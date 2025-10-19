public class TestApp {
    public static void main(String[] args) {
        float a = 10;
        float b = (float) 12.5;
        System.out.println("a+b=" + (a + b));
        System.out.println("CLI test application");
    }
}
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st num: ");
        double a = Double.valueOf(in.nextLine());
        System.out.print("2nd num: ");
        double b = Double.valueOf(in.nextLine());
        System.out.println("a+b=" + (a + b));
        System.out.println("GIT test application");
    }
}
