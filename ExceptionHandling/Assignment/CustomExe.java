package ExceptionHandling.Assignment;
import java.util.*;
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class CustomExe {
    public static void main(String args[]) throws CustomException{
        try {
            Scanner sc = new Scanner(System.in);
            int num =sc.nextInt();
            if ( num> 100 || num<0){
                throw new CustomException("Age must be between 0-100");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        
    }
}
