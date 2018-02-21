package question10;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            if (i < 2) {
                continue;
            }
            System.out.println(i); // 2 3 4 5
            if (i == 3) {
                continue;
            }
        }
    }
}
