package data;

import java.util.Objects;

public class Retiree extends User {

    String profession;
    int yearOfPensionStart;

    public Retiree(String name, int age, String sex, int height, String profession, int yearOfPensionStart) {
        super(name, age, sex, height);
        this.profession = profession;
        this.yearOfPensionStart = yearOfPensionStart;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getYearOfPensionStart() {
        return yearOfPensionStart;
    }

    public void setYearOfPensionStart(int yearOfPensionStart) {
        this.yearOfPensionStart = yearOfPensionStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Retiree)) return false;
        if (!super.equals(o)) return false;
        Retiree retiree = (Retiree) o;
        return getYearOfPensionStart() == retiree.getYearOfPensionStart() &&
                Objects.equals(getProfession(), retiree.getProfession());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getProfession(), getYearOfPensionStart());
    }

    @Override
    public String toString() {
        return "Retiree " +
                "profession " + profession + '\'' +
                ", yearOfPensionStart " + yearOfPensionStart +
                ", name " + name + '\'' +
                ", age " + age +
                ", sex " + sex + '\'' +
                ", height " + height +
                super.toString();
    }

 //   public int getYearsOfPension (){
 //       int yearsOfPension = 2019 - yearOfPensionStart;
 //       return yearsOfPension;
 //   }

    @Override
    public int getStag(){
        return 2019 - this.getYearOfPensionStart();
    }

    @Override
    public boolean findByParameter(String parameter) {
        if(profession.equalsIgnoreCase(parameter)) return true;
        return false;
    }
}
