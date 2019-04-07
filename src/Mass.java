public  class Mass implements Comparable<Mass>{
    public double mass;
    public Container c;
    public Liquid l;
    Mass (Container c, Liquid l){
        this.c = c;
        this.l = l;
        this.mass = (c.returnCon()*l.returnI()*100.0)/100.0;
    }
    String printname(){
        return c.printSize() + ", жидкость: " + l.printname() + ", масса:" + mass;
    }
    double returnMass(){
        return mass;
    }
    public int compareTo(Object obj) {
        Mass m = (Mass) obj;
        if (this.returnMass() == m.returnMass())
            return 0;
        else if (this.returnMass() < m.returnMass())
            return 1;
        else return -1;
    }


}
