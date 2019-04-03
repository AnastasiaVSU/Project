import java.util.Scanner;
public class Circle extends Sort implements Size {
    Scanner in = new Scanner(System.in);
    public void V() {
        System.out.println("Введите радиус круга: ");
        int radius = in.nextInt();
        System.out.println("Введите высоту ёмкости: ");
        int H = in.nextInt();
        System.out.println("Объем ёмкости, в основании которой круг = " +  2*PI*radius*H);
    }
}
