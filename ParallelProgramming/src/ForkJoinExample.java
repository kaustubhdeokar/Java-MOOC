import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinExample extends RecursiveTask<Integer> {

    int[] array;
    int start;
    int end;

    public ForkJoinExample(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if ((end - start) > 4) {
            return ForkJoinTask.invokeAll(createTasks(array, start, end))
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        } else {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            System.out.println("start:"+start+" end:"+end+" sum:"+sum);
            return sum;
        }
    }

    private List<ForkJoinExample> createTasks(int[] array, int start, int end) {
        int mid = start + (end - start) / 2;
        List<ForkJoinExample> subtasks = new ArrayList<>();
        ForkJoinExample forkJoinExample1 = new ForkJoinExample(this.array, this.start, mid);
        ForkJoinExample forkJoinExample2 = new ForkJoinExample(this.array, mid + 1, this.end);
        subtasks.add(forkJoinExample1);
        subtasks.add(forkJoinExample2);
        return subtasks;
    }


    public static void main(String[] args) {

        int[] array = new int[16];
        for (int i = 0; i < 16; i++) {
            array[i] = i + 1;
        }

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        ForkJoinExample forkJoinExample = new ForkJoinExample(array, 0, array.length);
        System.out.println(forkJoinPool.invoke(forkJoinExample));


    }
}
