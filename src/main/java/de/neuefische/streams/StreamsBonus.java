package de.neuefische.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StreamsBonus {

   public static void main(String[] args) throws IOException {

  Files.lines(Path.of("students.csv"))
           .skip(1)
           .filter(s1 -> !s1.isBlank())
           .map(s -> s.split(","))
           .map(s -> new Student(s[0], s[1], s[2], s[3]))
           .distinct()
           .forEach(System.out::println);

   }
}
