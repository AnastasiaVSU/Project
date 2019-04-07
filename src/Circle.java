import static java.lang.Math.PI;

public class Circle extends Container {
  Circle(double r, double H){
      this.r = r;
      this.H = H;
      c = 2*PI*r*H;
  }
  @Override
    public String toString(){
      return "Радиус круга: " + r + "высота ёмкости: " + H;
  }
}



