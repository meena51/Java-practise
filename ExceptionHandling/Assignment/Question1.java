// Write a small piece of code which shows simple usage of try catch block with throw and throws keyword
package ExceptionHandling.Assignment;
import java.io.IOException;
import java.util.*;
public class Question1 {
    public static void main(String args[]) throws Exception{
        try {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            if(n<0){
                throw new IOException();
            }
            System.out.println(n);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
