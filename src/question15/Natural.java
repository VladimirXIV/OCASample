package question15;

public class Natural {

    private int i;

    void disp() {

        while (i <= 5) {
            for(int i=1; i <= 5;) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        new Natural().disp();
    }
}
