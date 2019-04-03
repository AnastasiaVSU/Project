public class Liquid {
    public double density;
    public String name;
    Liquid (double p, String name){
        this.density = p;
        this.name = name;
    }
    String printStats(){
        return name + "(" + density + " " + "кг/м^3)" ;
    }
    double rerutnDensity(){
        return density;
    }
}