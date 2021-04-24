/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPLab8;
import java.util.Comparator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author START
 */
public class MainClass {
    public static void main(String[] args) {
        Human sasha = new Human("Sasha",18,"KPI");
        Human vitaliy = new Human("VITALIY",23,"KPI");
        Human ivan = new Human("Ivan",20,"KPI");

        TreeSet<Human> list1 = new TreeSet<>(Human.getComparator());

        list1.add(ivan);
        list1.add(sasha);
        list1.add(vitaliy);
        System.out.println(list1);
        //k

        ArrayList<Human> list2 = new ArrayList<>();
        list2.add(sasha);
        list2.add(ivan);
        list2.add(vitaliy);

        Collections.sort(list2, new Human.NameComparator());

        Human.S s = new Human().new S();
        s.ss();
        Human as = new Human();

        System.out.println(list2);

        //

        Comparator<Human> nameComparator = (Human o1, Human o2) -> o1.name.charAt(0) - o2.name.charAt(0);
        Comparator<Human> reverseComparator = nameComparator.reversed();
        Comparator<Human> ageComparatorComparator = nameComparator.thenComparing((Human o1, Human o2) -> o1.age - o2.age);
        Comparator<Human> nullsFirstComparator = Comparator.nullsFirst((Human o1, Human o2) -> o1.name.charAt(0) - o2.name.charAt(0));
        Comparator<Human> nullsLastComparator = Comparator.nullsLast((Human o1, Human o2) -> o1.name.charAt(0) - o2.name.charAt(0));

        TreeSet<Human> people = new TreeSet<>( nullsLastComparator); // change comparator here

        Student ivan1 = new Student("Ivan", 19, "KPI");
        Human petro = new Human("Petro", 34,  "NAU");
        Student pedro = new Student();
        Student serhiy = new Student("Serhiy", 18, "LNU");
        Student nobody = null;

        people.add(ivan1);
        people.add(pedro);
        people.add(petro);
       people.add(nobody);
        people.add(serhiy);
        System.out.println(people);


    }
}

