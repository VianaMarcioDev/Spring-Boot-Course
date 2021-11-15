package br.com.zup.Spring.Boot.Essentials.Course.model;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Student {

    private String name;
    private int id;
    public static List<Student> studentList;
    static {
        studentRepository();
    }

    public Student(String márcio) {
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
        studentList = new ArrayList<>(asList(new Student("Márcio"), new Student("Aldilene")));
    }
}


