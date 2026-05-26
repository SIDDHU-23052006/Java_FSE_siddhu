import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressions {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}