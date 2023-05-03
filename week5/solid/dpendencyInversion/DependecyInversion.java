package week5.solid.dpendencyInversion;

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[Console] " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[file] " + message);
    }
}

//The logger used in App is abstracted. We can use any type of logger without any complication.
class App {
    private Logger logger;

    public App(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        // Do something
        logger.log("Something was done.");
    }
}

public class DependecyInversion {
    public static void main(String[] args) {
        Logger l = (message) -> System.out.println("From lamda " + message);
        ConsoleLogger c = new ConsoleLogger();
        FileLogger f = new FileLogger();

        App app = new App(l);
        app.doSomething();

        App app1 = new App(c);
        app1.doSomething();

        App app2 = new App(f);
        app2.doSomething();

        
    }
}
