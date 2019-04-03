import java.util.Scanner;

public class Triangle extends Sort implements Size {
    Scanner in = new Scanner(System.in);
    public void V() {
        System.out.println("Введите сторону треугольника: ");
        int a = in.nextInt();
        System.out.println("Введите высоту треугольника: ");
        int h = in.nextInt();
        System.out.println("Введите высоту ёмкости: ");
        int H = in.nextInt();
        System.out.println("Объем ёмкости, в основании которого треугольник = " + ((a*h)/2)*H);
    }

}
