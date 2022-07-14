package de.neuefische.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Streams {

    public static void main(String[] args) {

        List<Person> coaches = List.of(
                new Person("Daniel", 37),
                new Person("Christopher", 29),
                new Person("Florian", 25),
                new Person("Dominic", 31)
        );

        Optional<String> jungeFische = coaches.stream()
                .filter(coach -> {
                    System.out.println(coach + " ist gerade im Wasser");
                    return coach.getAge() <= 30;
                })
                .map(Person::getName)
                .filter(firstname -> firstname.length() < 8)
                .findFirst();


        System.out.println("JungeFische= "+jungeFische);




        List<Person> filteredList = new ArrayList<>();
        for (Person c:coaches) {
            if (c.getAge() <=30){
                filteredList.add(c);
            }
        }
        System.out.println("filteredList= " + filteredList);
    }
}
