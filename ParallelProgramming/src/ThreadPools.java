import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
CODE SAMPLE TAKEN FROM JENKOV.COM TUTORIALS.

A thread pool is a pool threads that can be "reused" to execute tasks, so that each thread may execute more than one task.
A thread pool is an alternative to creating a new thread for each task you need to execute.
Creating new thread comes with performance overhead compared to reusing a thread.

Java has an in-built thread pool -> Java ExecutorService

*
*/

import java.util.List;

public class ThreadPools {


    private BlockingQueue taskQueue = null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;

    public ThreadPools(int noOfThreads, int maxNoOfTasks) {

        taskQueue = new ArrayBlockingQueue(maxNoOfTasks);

        for (int i = 0; i < noOfThreads; i++) {
            PoolThreadRunnable poolThreadRunnable = new PoolThreadRunnable(taskQueue);
            runnables.add(poolThreadRunnable);
        }
        for (PoolThreadRunnable runnable : runnables) {
            new Thread(runnable).start();
        }
    }

    public synchronized void execute(Runnable task) throws Exception {
        if (this.isStopped) throw
                new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.offer(task);
    }

    public synchronized void stop() {
        this.isStopped = true;
        for (PoolThreadRunnable runnable : runnables) {
            runnable.doStop();
        }
    }

    public synchronized void waitUntilAllTasksFinished() {
        while (this.taskQueue.size() > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class PoolThreadRunnable implements Runnable {

        private Thread thread = null;
        private BlockingQueue taskQueue = null;
        private boolean isStopped = false;

        public PoolThreadRunnable(BlockingQueue queue) {
            taskQueue = queue;
        }

        public void run() {
            this.thread = Thread.currentThread();
            while (!isStopped()) {
                try {
                    Runnable runnable = (Runnable) taskQueue.take();
                    runnable.run();
                } catch (Exception e) {
                    //log or otherwise report exception,
                    //but keep pool thread alive.
                }
            }
        }

        public synchronized void doStop() {
            isStopped = true;
            //break pool thread out of dequeue() call.
            this.thread.interrupt();
        }

        public synchronized boolean isStopped() {
            return isStopped;
        }
    }

    public static void main(String[] args) throws Exception {

        ThreadPools threadPool = new ThreadPools(3, 10);

        for (int i = 0; i < 10; i++) {

            int taskNo = i;
            threadPool.execute(() -> {
                String message =
                        Thread.currentThread().getName()
                                + ": Task " + taskNo;
                System.out.println(message);
            });
        }

        threadPool.waitUntilAllTasksFinished();
        threadPool.stop();

    }

}
