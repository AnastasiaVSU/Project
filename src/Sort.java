import java.util.*;
import java.util.List;

public class Sort {
        public static void main(String[] args) {
        final int n = 5;
        Random R = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону: ");
        double a = in.nextDouble();
        System.out.println("Введите высоту: ");
        double h = in.nextDouble();
        System.out.println("Введите радиус: ");
        double r = in.nextDouble();
        System.out.println("Введите высоту ёмкости: ");
        double H = in.nextDouble();
        ArrayList<Container> con = new ArrayList<>();
        con.add(new Quadrat(a, H));
        con.add(new Triangle(a, h, H));
        con.add(new Circle(r, H));
        List<Liquid> liq = Arrays.asList(Liquid.values());
            ArrayList<Mass> massContainer = new ArrayList<>();
            for (int i = 0; i < n; i++)
                massContainer.add(new Mass(con.get(R.nextInt(con.size())), liq.get(R.nextInt(liq.size()))));
            for (int i = 0; i<n; i++)
                System.out.println(massContainer.get(i).printname());
    }
}

