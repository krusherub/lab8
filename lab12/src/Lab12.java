import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab12 {
    public static void main(String[] args) {
        Human sasha = new Human("Sasha");
        Human vitalya = new Human("Vitalya");
        Human vanya = new Human("Vanya");


        ArrayList<Human> lst = new ArrayList<>();

        lst.add(sasha);
        lst.add(vitalya);
        lst.add(vanya);

        Arrays.asList("Sasha", "Vanya", "Vitalya").forEach(Human::new);
        lst.forEach(System.out::println);
        lst.forEach(Human::getCount);
        lst.forEach(Human::isEven);

    }
}
