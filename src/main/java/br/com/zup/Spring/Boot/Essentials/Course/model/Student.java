package br.com.zup.Spring.Boot.Essentials.Course.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

@Component
public class Student {

    private String name;
    private int id;
    public static List<Student> studentList;
    static {
        studentRepository();
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }

   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static void studentRepository(){
        studentList = new ArrayList<>(asList(new Student("Márcio",1) , new Student("Aldilene",2)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}


