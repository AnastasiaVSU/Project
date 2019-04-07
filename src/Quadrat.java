public class Quadrat extends Container {
    Quadrat(double a, double H){
        this.a = a;
        this.H = H;
        c = a*a*H;
    }
    @Override
    public String toString(){
        return "Сторона квадрата: " + a + " " + "высота ёмкости: " + H;
    }
}
