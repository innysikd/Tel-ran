package data;

import java.util.Objects;

public class Student extends User {

    String nameOfInstitute;
    int yearOfEducationStart;

    public Student(String name, int age, String sex, int height, String nameOfInstitute, int yearOfEducationStart) {
        super(name, age, sex, height);
        this.nameOfInstitute = nameOfInstitute;
        this.yearOfEducationStart = yearOfEducationStart;
    }

    public String getNameOfInstitute() {
        return nameOfInstitute;
    }

    public void setNameOfInstitute(String nameOfInstitute) {
        this.nameOfInstitute = nameOfInstitute;
    }

    public int getYearOfEducationStart() {
        return yearOfEducationStart;
    }

    public void setYearOfEducationStart(int yearOfEducationStart) {
        this.yearOfEducationStart = yearOfEducationStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getYearOfEducationStart() == student.getYearOfEducationStart() &&
                Objects.equals(getNameOfInstitute(), student.getNameOfInstitute());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNameOfInstitute(), getYearOfEducationStart());
    }

    @Override
    public String toString() {
        return "Student " +
                "nameOfInstitute " + nameOfInstitute + '\'' +
                ", yearOfEducationStart " + yearOfEducationStart +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                "} " + super.toString();
    }

 //   public int getYearsOfEducation (){
 //       int yearsOfEducation = 2019 - yearOfEducationStart;
 //       return yearsOfEducation;
 //       }

    @Override
    public int getStag(){
        return 2019 - this.getYearOfEducationStart();
        }

    @Override
    public boolean findByParameter(String parameter) {
        if (nameOfInstitute.equalsIgnoreCase(parameter)) return true;
        return false;
    }
}
