Taken from linkedin learning course:[Parallel and Concurrent Programming with Java 1](https://www.linkedin.com/learning/parallel-and-concurrent-programming-with-java-1)

> Flynn's taxonomy.

1. Single instruction - single data.

2. Single instruction - multiple data.<br>
    Same instruction executed on multiple data. gpu's for image processing.

3. Multiple instruction - single data.

4. Multiple instruction - multiple data.<br>
   most common

> Memory Models

1. Shared Memory
   1. same memory which all the processors can access.
2. Distributed Memory
   1. here explicit contact has to be made been different processors about a change in one memory.

> Communication between two processes, IPC - Inter process communication, RPC's

> Concurrent - order independent

reentrant lock can be locked multiple times.
it also has to be unlocked the same number of times.

a normal lock if locked more than once enters a deadlock state.


TRY LOCK
lock only if you can.