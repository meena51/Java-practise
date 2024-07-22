package Assignment;
class Count implements Runnable{
    public void run(){
        for(int i =0; i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

public class ThreadCreation {
    public static void main(String args[]){
        Count obj = new Count();
        Thread t= new Thread(obj);
        t.start();
    }
}
