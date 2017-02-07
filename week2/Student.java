package week2.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Student {

    private String studName;
    private int studCourse;

    private Student(String name, int course) {
        studName = name;
        studCourse = course;
    }

    private String getName() {
        return this.studName;
    }
    private int getCourse() {
        return this.studCourse;
    }

    private static void printStudents(List students, int course) {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Student st1 = new Student("Ivanov Ivan", 1);
        Student st2 = new Student("Petrov Petr", 2);
        Student st3 = new Student("Alexeev Alexey", 3);
        Student st4 = new Student("Bogdanov Bogdan", 4);
        Student st5 = new Student("Georgiev Georgiy", 1);
        Student st6 = new Student("Fedorov Fedor", 3);
        Student st7 = new Student("Kirillov Kirill", 4);
        Student st8 = new Student("Sergeev Sergey", 2);
        Student st9 = new Student("Stepanov Stepan", 5);
        Student st10 = new Student("Nikolaev Nikolay", 3);
        List <Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5, st6, st7, st8, st9, st10));
        printStudents(students, 1);
    }
}
