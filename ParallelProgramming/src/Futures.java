import java.util.concurrent.*;

public class Futures {

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        Futures futures = new Futures();
        futures.writeABasicFuture();
    }

    private void writeABasicFuture() {

        Future<Long> future = executorService.submit(() -> {
            long a = 0;
            long b = 1;
            int nums = 2;
            long c = 0;
            while (nums < 1000) {
                c = a + b;
                a = b;
                b = c;
                nums += 1;
            }
            return c;
        });
        while (!future.isDone()) {
            System.out.println("...");
        }
        try {
            Long answer = future.get();
            System.out.println(answer);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }


    }

}
