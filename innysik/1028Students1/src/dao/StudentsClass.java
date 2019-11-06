package dao;

import data.Sex;
import data.Student;

import javax.sound.midi.Soundbank;

public class StudentsClass {

    private Student[] students;
    int size;

    public StudentsClass (int capacity){
        students = new Student[capacity];
        size = 0;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean addStudent(Student student){
        if (size<students.length){
            students[size] = student;
            size ++;
            return true;
        }
        return false;
    }

    public boolean deleteStudent (Student student){
        for (int i = 0; i<size; i++){
            if (students[i].equals(student)){
                students[i] = students [size-1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayStudentsClass (){
        for (int i = 0; i<size; i++){
            System.out.println(students[i]);
        }
    }

    public void youngestStudent (){
        int youngestStudent = students[0].getAge();
        for (int i = 1; i<size; i++){
            if (youngestStudent<students[i].getAge());
            youngestStudent = students[i].getAge();
        }
        System.out.println("The youngest student is of age: " + youngestStudent);
    }

    public int getFemaleCount (){
        int count = 0;
        boolean flag = true;
        for (int i = 0; i<size; i++){
            if (students[i].getSex().equals(Sex.FEMALE)){
                count ++;
                flag = true;
            }
        }
        System.out.println("We have " + count + " females.");
        flag = false;
        return count;
    }

    public int getMaleCount (){
        int count = 0;
        boolean flag = true;
        for (int i = 0; i<size; i++){
            if (students[i].getSex().equals(Sex.MALE)){
                count ++;
                flag = true;
            }
        }
        System.out.println("We have " + count + " males.");
        flag = false;
        return count;
    }


        public void countStudentByGender (){
            int male = 0;
            int female = 0;
            for (int i = 0; i<size; i++){
                if(students[i].getSex().equals(Sex.MALE)) {
                //    if(students[i].getSex().name().equalsIgnoreCase("MALE"));  - here we convert Enum to String. this will work better
                    male++;
                }else {
                        female++;
                    }
                }
                System.out.println("We have " + male + " males.");
                System.out.println("We have " + female + " males.");
        }








}
