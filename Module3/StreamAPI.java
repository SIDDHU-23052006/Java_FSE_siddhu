import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> even = list.stream()
                                 .filter(n -> n % 2 == 0)
                                 .collect(Collectors.toList());

        System.out.println("Even Numbers:");

        for (int i = 0; i < even.size(); i++) {
            System.out.println(even.get(i));
        }
    }
}