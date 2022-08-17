/**
 * Threads that waste CPU cycles
 */

class CPUWaster extends Thread {
    public void run() {
        while (true) {}
    }
}

public class ThreadProcessDemo {
    public static void main(String args[]) throws InterruptedException {

        Runtime rt = Runtime.getRuntime();
        long usedKB = (rt.totalMemory() - rt.freeMemory()) / 1024 ;
        System.out.format("  Process ID: %d\n", ProcessHandle.current().pid());
        System.out.format("Thread Count: %d\n", Thread.activeCount());
        System.out.format("Memory Usage: %d KB\n", usedKB);

        // start 6 new threads
        System.out.println("\nStarting 6 CPUWaster threads...\n");
        for (int i=0; i<6; i++)
            new CPUWaster().start();

        // display current information about this process
        usedKB = (rt.totalMemory() - rt.freeMemory()) / 1024 ;
        System.out.format("  Process ID: %d\n", ProcessHandle.current().pid());
        System.out.format("Thread Count: %d\n", Thread.activeCount());
        System.out.format("Memory Usage: %d KB\n", usedKB);

        System.out.println("Check the task manager->performance tab. Active threads consumes CPU cycles.");

    }
}