import java.lang.reflect.Method;

class Student {

    public void display(String name) {

        System.out.println("Name: " + name);
    }
}

public class ReflectionExample {
    public static void main(String[] args) {

        try {

            Class c = Class.forName("Student");

            Object obj = c.getDeclaredConstructor().newInstance();

            Method[] methods = c.getDeclaredMethods();

            for (int i = 0; i < methods.length; i++) {

                System.out.println(methods[i].getName());
            }

            Method m = c.getDeclaredMethod(
                    "display",
                    String.class
            );

            m.invoke(obj, "Rio");
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }
}