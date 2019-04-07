import org.jetbrains.annotations.Contract;

public enum Liquid{
        Ethanol(789),
        Water(997),
        Gasoline(740);
        public final double i;
        Liquid(double i) {
            this.i = i;
        }
        double returnI(){
            return i;
        }
        public String nameLiquid;
        String printname(){
            return nameLiquid;
        }

    }
