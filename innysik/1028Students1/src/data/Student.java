package data;

import java.util.Objects;

public class Student {

    String name;
    Sex sex;
    int age;

    public Student(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName()) &&
                getSex() == student.getSex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge());
    }

    @Override
    public String toString() {
        return "Student " +
                "name " + name +
                ", sex " + sex +
                ", age " + age;
    }
}
