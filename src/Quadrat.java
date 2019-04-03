import java.util.Scanner;
import static java.lang.StrictMath.sqrt;
public class Quadrat extends Sort implements Size {
    Scanner in = new Scanner(System.in);
    public void V(){
        System.out.println("Введите сторону квадрата: ");
        int a = in.nextInt();
        System.out.println("Введите высоту ёмкости: ");
        int H = in.nextInt();
        System.out.println("Объем ёмкости, в основании которой квадрат =" + a*a*H);
    }
}
