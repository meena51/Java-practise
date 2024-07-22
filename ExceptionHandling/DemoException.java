package ExceptionHandling;

public class DemoException {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 0;
        try {
            int k = i / j; // Declare and initialize k inside the try block
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
