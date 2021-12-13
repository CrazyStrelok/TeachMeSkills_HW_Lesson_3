import java.util.ArrayList;
import java.util.Collections;

public class task6 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Garry");
        names.add("Antone");
        names.add("Andrew");
        names.add("Vasya");
        names.add("Paul");
        names.add("Steven");
        names.add("Frank");
        names.add("Jhone");
        Collections.sort(names);
        System.out.println(names);
    }
}
