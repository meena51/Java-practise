public class Main {
    public static void main(String[] args) {
        names(0);
        printNumbers(1);
    }

    public static void names(int n) {
        if (n == 5) {
            return;
        }
        System.out.println("Meena");
        n++;
        names(n);
    }
    public static void printNumbers(int n) {
        if (n == 11) {
            return;
        }
        System.out.println(n);
        n++;
        printNumbers(n);
    }

}
