public class Triangle extends Container{
    Triangle (double a, double h, double H){
        this.a = a;
        this.h = h;
        this.H = H;
        c = ((a*h)/2)*H;
    }
    @Override
     public  String toString(){
        return "Сторона треугольника: " + a + "высота треугольника: " + h + "высота ёмкости" + H;
    }
}
