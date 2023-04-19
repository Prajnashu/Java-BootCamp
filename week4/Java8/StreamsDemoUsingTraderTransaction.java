package week4.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemoUsingTraderTransaction {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");


        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );




        /*

        1. Find all transactions in the year 2011 and sort them by value (small to high).
        2. What are all the unique cities where the traders work?
        3. Find all traders from Cambridge and sort them by name.
        4. Return a string of all traders’ names sorted alphabetically.
        5. Are any traders based in Milan?
        6. Print all transactions’ values from the traders living in Cambridge.
        7. What’s the highest value of all the transactions?
        8. Find the transaction with the smallest value

        */
        //1. Find all transactions in the year 2011 and sort them by value (small to high).
        System.out.println("Transactions in the year 2011 sorted by value: ");
        Stream<Transaction> stream1 = transactions.stream();
        List<Transaction> list = stream1.filter(i -> i.getYear() == 2011).sorted(Comparator.comparingInt(Transaction::getYear)).collect(Collectors.toList());

        list.forEach(System.out::println);
        System.out.println();

        //2. What are all the unique cities where the traders work?
        System.out.print("Unique cities where the traders work: ");
        Stream<Transaction> stream2 = transactions.stream();
        Set<String> setOfCities = stream2.map(i -> i.getTrader().getCity()).collect(Collectors.toSet());
        System.out.println(setOfCities);
        System.out.println();

        //3. Find all traders from Cambridge and sort them by name.
        System.out.print("All traders from Cambridge sorted by name: ");
        Stream<Transaction> stream3 = transactions.stream();
        List<Trader> listOfTraders = stream3.filter(i -> i.getTrader().getCity() == "Cambridge")
                                            .map(i -> i.getTrader()).distinct().sorted((t1,t2) -> t1.getName().compareTo(t2.getName())).collect(Collectors.toList());
        System.out.println(listOfTraders);
        System.out.println();

        //4. Return a string of all traders’ names sorted alphabetically.
        Stream<Transaction> stream4 = transactions.stream();
        System.out.print("All trader names sorted by name: ");
        List<String> listOfNames = stream4.map(i -> i.getTrader().getName()).distinct().sorted().collect(Collectors.toList());
        System.out.println(listOfNames);
        System.out.println();

        //5. Are any traders based in Milan?
        Stream<Transaction> stream5 = transactions.stream();
        System.out.println("Are any traders based on Milan? : " + stream5.anyMatch(i -> i.getTrader().getCity() == "Milan"));
        System.out.println();

        //6. Print all transactions’ values from the traders living in Cambridge.
        Stream<Transaction> stream6 = transactions.stream();
        System.out.print("Transaction's values from traders in Cambridge");
        List<Integer> transactionsFromCambridge = stream6.filter(i -> i.getTrader().getCity() == "Cambridge")
                                                                .map(i -> i.getValue())
                                                                .collect(Collectors.toList());
        System.out.println(transactionsFromCambridge);
        System.out.println();

        //7. What’s the highest value of all the transactions?
        System.out.print("Highest value of all the transactions: ");
        Stream<Transaction> stream7 = transactions.stream();
        Optional<Integer> highestValue = stream7.map(i -> i.getValue())
                                                .max(Comparator.naturalOrder());
        if(highestValue.isPresent())
            System.out.println(highestValue.get());
        else
            System.out.println("Stream is empty");
        System.out.println();
    

        //8. Find the transaction with the smallest value
        System.out.print("Transaction with smallest value: ");
        Stream<Transaction> stream8 = transactions.stream();
        Optional<Transaction> smallestValueTransaction = stream8.min(Comparator.comparingInt(Transaction::getValue));
        if(smallestValueTransaction.isPresent()) 
            System.out.println(smallestValueTransaction.get());
        else
            System.out.println("Empty stream");
        
    }
}


class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;
    public Transaction(Trader trader, int year, int value){
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public Trader getTrader(){
        return this.trader;
    }
    public int getYear(){
        return this.year;
    }
    public int getValue(){
        return this.value;
    }
    public String toString(){
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }
}

class Trader{
    private final String name;
    private final String city;
    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }
}
