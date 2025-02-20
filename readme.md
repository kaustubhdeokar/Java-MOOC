This folder consists of the exercise files from various courses/platforms mentioned specifically in each of them. 

Terminologies

- transient - the class won't be serialized.
- serialization - convert the class and it's dependents to a graphs of binary objects, can save them in a file and send them over a network.
- streams: https://www.youtube.com/watch?v=_VIHuuXsMoM
- future: when you submit a runnable or callable to an executor service, it outputs a future object. It's a placeholder for the result of the computation. whenever the executor service completes, the result is stored in the future object.
- Java 7, 11 and 17
  - Java 8: Introduced major features like Lambda expressions, the Stream API, and the new Date and Time API (java.time).
  - Java 11: Added features such as the var keyword for local variable type inference, the HTTP Client API, and various performance and security improvements.
  - Java 17: Introduced features like sealed classes, pattern matching for switch (preview), and removal of deprecated APIs and modules.
- heap memory - new instantiation support offered by Java.

Compilation flow
- Writing the Code:  
    - The developer writes Java source code in .java files.
Compilation:  
    - The Java compiler (javac), which is part of the JDK, compiles the source code into bytecode. The bytecode is stored in .class files.
    - Bytecode:  
    - Bytecode is an intermediate, platform-independent representation of the code.
    - Execution:  
    - The Java Runtime Environment (JRE) includes the Java Virtual Machine (JVM) and the standard libraries.
    - The JVM loads the bytecode and translates it into machine code specific to the host system.
    - The JVM executes the machine code, running the Java application.

- In summary:
- JDK: Used for development (includes javac).
- JRE: Used for running Java applications (includes JVM and standard libraries).
- JVM: Executes the bytecode on the host system.