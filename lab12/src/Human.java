import java.util.Comparator;

class Human {

    protected String name;
    int age;
    String occupation;
    String hobby;
    Integer count = 0;

    public Human(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
        count++;
    }

    public void setHobby() {
        this.hobby = "some fascinating ACTIVITY";
    }

    public String getHobby() {
        if (count.equals(0)) setHobby();
        return hobby;
    }


    @Override
    public String toString() {
        return name;
    }

    static class NameComparator implements Comparator<Human> {
        @Override
        public int compare(Human o1, Human o2) {
            return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
        }
    }
    class S{
        public void ss(){
            System.out.println(111);
        }
    }


    public static Comparator getComparator() {
        Comparator comparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.age - o2.age;
            }
        };
        return comparator;
    }
    public static void getCount(Human human){
        System.out.println(human.name.length());
    }
    public void isEven(){
        System.out.println(name.length() % 2 == 0);
    }

}