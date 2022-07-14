package de.neuefische.streams;

import java.util.Objects;

public class Student {

    private final String id;
    private final String name;
    private final String postalcode;
    private final String age;

    public Student(String id, String name, String postalcode, String age) {
        this.id = id;
        this.name = name;
        this.postalcode = postalcode;
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(postalcode, student.postalcode) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, postalcode, age);
    }
}
