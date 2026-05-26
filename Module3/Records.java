import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) { }

public class Records {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("Rio", 20));
        list.add(new Person("Arun", 17));
        list.add(new Person("Kavin", 22));

        System.out.println("All Records:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Person> result = list.stream()
                                  .filter(p -> p.age() >= 18)
                                  .collect(Collectors.toList());

        System.out.println("Filtered Records:");

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}