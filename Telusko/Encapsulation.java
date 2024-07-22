package Telusko;

class Human {
    private String name;
    private int age;

    public void setName(String m) {
        name = m;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("Telusko.Encapsulation");
        Human obj = new Human();
        obj.setName("Meena");
        obj.setAge(21);
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
