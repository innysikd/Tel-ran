package controller;

import dao.StudentsClass;
import data.Sex;
import data.Student;

public class StudentsApp {

    public static void main(String[] args) {

        Student student1 = new Student ("Petrov", Sex.MALE, 29);
        Student student2 = new Student ("Sokolova", Sex.FEMALE, 25);
        Student student3 = new Student ("Zatusina", Sex.FEMALE, 22);
        Student student4 = new Student ("Ivanov", Sex.MALE, 23);
        Student student5 = new Student ("Jakovlev", Sex.MALE, 21);

        StudentsClass studentsClass = new StudentsClass(30);

        studentsClass.addStudent(student1);
        studentsClass.addStudent(student2);
        studentsClass.addStudent(student3);
        studentsClass.addStudent(student4);
        studentsClass.addStudent(student5);

        studentsClass.displayStudentsClass();

        System.out.println("-------");

        studentsClass.youngestStudent();

        System.out.println("-------");

        studentsClass.getFemaleCount();
        studentsClass.getMaleCount();





    }
}
