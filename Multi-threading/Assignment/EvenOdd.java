package Assignment;
class Even extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        try {
            Thread.sleep(1000);
        }catch(Exception e){}
    }
}
}
class Odd extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        try {
            Thread.sleep(1000);
        }catch(Exception e){}
    }
}
}

public class EvenOdd {
    public static void main(String args[]){
        Even ob1 = new Even();
        Odd ob2 = new Odd();
        ob1.start();
        ob2.start();
    }
}
