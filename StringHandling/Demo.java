package StringHandling;

class Mobile{
    String brand;
    int price;
    static String name;
    public static void show(Mobile obj){
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }
}
public class Demo {
    public static void main(String args[]){
       Mobile obj1= new Mobile();
       obj1.brand="Oppo";
       obj1.price=10000;
       Mobile.name="SmartPhone";
       Mobile obj2= new Mobile();
       Mobile.show(obj1);
       Mobile.show(obj2);
    }
}
