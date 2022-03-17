package Udemy15;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    @Test
    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Asbdds");
        names.add("Don");
        names.add("Alex");
        names.add("Ada");
        names.add("Ram");
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void streamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Asbdds");
        names.add("Don");
        names.add("Alex");
        names.add("Ada");
        names.add("Ram");
//        long c = names.stream().filter(s -> s.startsWith("A")).count();
//        System.out.println(c);

//        long d = Stream.of("Asd", "Don", "Adsad", "Ada", "Ra").filter(s -> {
//            return s.startsWith("A");
//        }).count();
//        System.out.println(d);

        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1);
    }

    @Test
    public void streamMap() {
        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Asbdds");
        names1.add("Doner");
        names1.add("Alex");
        names1.add("Adam");
        names1.add("Ram");
        Stream.of("Asd", "Don", "Adsad", "Ada", "Ra", "abbba", "Rama").filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        List<String> names = Arrays.asList("Asd", "Don", "Adsad", "Ada", "Ra", "abbba", "Rama");
        names.stream().filter(s -> s.startsWith("A")).sorted()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        Stream<String> newStream = Stream.concat(names1.stream(), names.stream());
        newStream.forEach(s -> System.out.println(s));
        newStream.anyMatch(s -> s.equalsIgnoreCase("adam"));
    }
    @Test
    public void streamCollect() {
        List<String> ls = Stream.of("Asd", "Don", "Adsad", "Ada", "Ra", "abbba", "Rama").filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        List<Integer> names = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
        names.stream().distinct().forEach(s -> System.out.println(s));
        List<Integer> li = names.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));
    }
}
