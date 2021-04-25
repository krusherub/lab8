import java.util.ArrayList;

public class Lab11 {
    public static void main(String[] args) {
        ICalc calc = (a,b,c,d)-> Math.pow(4 * Math.cosh( Math.sqrt( Math.abs(a/b) ) )+3 * Math.acos(d), c);
        //System.out.println(calc.calculate(1,1,1,1));
        doCalc(calc,1,1,1,1);

        Human sanya = new Human("Sanya",12,"KPI");
        Human vitalya = new Human("Vitalya",18,"KPI");
        Human vanya = new Human("Vanya",25,"KPI");
        ArrayList<Human> lst = new ArrayList<>();
        lst.add(sanya);
        lst.add(vitalya);
        lst.add(vanya);

        lst.forEach((obj)-> System.out.println(obj));




    }
    public static void doCalc(ICalc func, double a,double b, double c,double d){
        System.out.println(func.calculate(a,b,c,d));
    }
}
