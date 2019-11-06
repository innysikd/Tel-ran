package controller;

import dao.Community;
import data.Retiree;
import data.Student;
import data.User;

public class UserApp {
    public static void main(String[] args) {

        Student s1 = new Student("Ivanov", 25, "male", 180, "TU", 2017);
        Student s2 = new Student("Petrov", 22, "male",185, "TA", 2018);
        Student s3 = new Student("Galkina", 25, "female", 170, "TAIO", 2010);

        Retiree r1 = new Retiree("Kladowsky", 89, "female", 167, "Teacher", 1983);
        Retiree r2 = new Retiree("Stinger", 80, "female", 178, "Bus driver", 1989);
        Retiree r3 = new Retiree("Ginter", 91, "male", 165, "Sewer", 1980);

        Community com1 = new Community (20);
        com1.addUser(s1);
        com1.addUser(s2);
        com1.addUser(s3);
        com1.addUser(r1);
        com1.addUser(r2);
        com1.addUser(r3);

      //  com1.display();

      // System.out.println(s1.getYearsOfEducation());

       // System.out.println(r2.getYearsOfPension());

        System.out.println(s1.getStag());

        com1.displayUsersByParameter("tu");




    }
}
