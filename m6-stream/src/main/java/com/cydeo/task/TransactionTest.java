package com.cydeo.task;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        System.out.println("1. Find all transactions in the year 2011 and sort them by value(small to high)");
        TransactionData.getAll().stream()
                .filter(p-> p.getYear()==2011)
//                .map(Transaction::getValue)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("\n2. What are all the unique cities where the traders work?");
        TransactionData.getAll().stream()
//                .map(transaction -> transaction.getTrader().getCity())
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n3. Find all traders from Cambridge and sort them by name.");
        TransactionData.getAll().stream()
                .filter(city -> city.getTrader().getCity().equals("Cambridge"))
//                .map(name->name.getTrader().getName())
//                .sorted()
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n4. Return a string of all traders’ names sorted alphabetically");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .distinct()
                .forEach(System.out::println);

        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(a,b)->a+b+" ");
        System.out.println("Sol2: " + result);

        System.out.println("\n5. Are any traders based in Milan?");
        if (TransactionData.getAll().stream()
                .anyMatch(p->p.getTrader().getCity().equals("Milan"))) System.out.println("Yes, trader based in Milan");
        else System.out.println("No, no trader in Milan");

        System.out.println("\n6. Print the values of all transactions from the traders living in Cambridge");
        List<Integer> list = TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        System.out.println(list);
        int min = list.stream().reduce(Integer::min).get();

        System.out.println("\n7. What is the highest value of all the transactions?");
        Transaction highestTransaction = TransactionData.getAll().stream()
                .max(Comparator.comparing(Transaction::getValue)).get();
        System.out.println("highestTransaction = " + highestTransaction);
        Integer minValue =TransactionData.getAll().stream()
                .min(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue).get();
        System.out.println("minValue = " + minValue);

        Integer maxValue = TransactionData.getAll().stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue).get();
        System.out.println("maxValue = " + maxValue);
        
        Integer min2 = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min).get();
        System.out.println("min2 = " + min2);
        
        List<Integer> listValues = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        System.out.println("values = " + listValues);

        Optional<Integer> min3 = listValues.stream().reduce(Integer::min);
        Optional<Integer> max = listValues.stream().reduce(Integer::max);
        Optional<Integer> sum = listValues.stream().reduce(Integer::sum);

        System.out.println("min3 = " + min3.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());

        System.out.println("\n8. Find the transaction with the smallest value");
        Transaction smallest = TransactionData.getAll().stream()
                .min(Comparator.comparing(Transaction::getValue)).get();
        System.out.println("transaction with the smallest value = " + smallest);

    }
}
