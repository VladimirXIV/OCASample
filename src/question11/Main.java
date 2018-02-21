package question11;

public class Main {
    public static void main(String[] args) {

        int x = 7;

        if (x > 10) {
            System.out.println(">");
        } else if (x < 10) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }

        //System.out.println(x>10?">":x<10?"<":"=");
    }
}