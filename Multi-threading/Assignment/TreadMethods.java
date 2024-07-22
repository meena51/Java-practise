package Assignment;

public class TreadMethods {
    public static void main(String args[]){
        Thread t = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println(i);
                try{
                    Thread.sleep(500);
                }catch(Exception e){}
            }
        });
        System.out.println(t.getId());
        System.out.println(t.isAlive());
        System.out.println(Thread.currentThread().getName());
        t.start();

    }
}
