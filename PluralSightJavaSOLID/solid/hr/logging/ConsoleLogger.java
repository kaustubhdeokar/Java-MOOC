package hr.logging;

public class ConsoleLogger {

    public void log(String errorMessage, Exception exception) {

        System.out.println(errorMessage + ":" + exception.getMessage());

    }

    public void log(String message) {

        System.out.println(message);

    }
}
