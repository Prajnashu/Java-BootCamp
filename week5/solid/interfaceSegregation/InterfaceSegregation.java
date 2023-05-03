package week5.solid.interfaceSegregation;

//The interface are segregated into individual interfaces based on their function. This helps to create classes like SimplePrinter which implements just a single interface.

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class MultiFunctionPrinter implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}

class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

public class InterfaceSegregation {
    public static void main(String[] args) {
        MultiFunctionPrinter m = new MultiFunctionPrinter();
        m.fax();
        m.print();
        m.scan();

        SimplePrinter s = new SimplePrinter();
        s.print();
    }
}

