import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Integer> {

    int num;

    Task(int num) {

        this.num = num;
    }

    public Integer call() {

        return num * num;
    }
}

public class ExecutorCallable {
    public static void main(String[] args) {

        try {

            ExecutorService ex = Executors.newFixedThreadPool(3);

            Future<Integer> f1 = ex.submit(new Task(2));
            Future<Integer> f2 = ex.submit(new Task(4));
            Future<Integer> f3 = ex.submit(new Task(6));

            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());

            ex.shutdown();
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }
}