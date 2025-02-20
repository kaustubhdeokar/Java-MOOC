public class VirtualThreads {

    //from java 17 virtual threads are introduced.
    //the previous set of thread are called as platform threads.
    //virtual threads are executed by platform threads.

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for(int i=0; i<10; i++) {
                System.out.println("Index: " + i);
            }
        };

//        Thread vThread = Thread.ofVirtual().start(runnable);
//        not usable :-(


    }

}
