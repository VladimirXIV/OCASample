package question9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alpha> strs = new ArrayList<>();
        strs.add(new Alpha());
        strs.add(new Beta());
        strs.add(new Gamma());
        for (Alpha t :strs) {
            System.out.println(t.doStuff("Java"));
        }
    }
}
