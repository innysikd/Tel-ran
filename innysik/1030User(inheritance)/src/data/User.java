package data;

import java.util.Objects;

public abstract class User {

    String name;
    int age;
    String sex;
    int height;

    public User(String name, int age, String sex, int height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                getHeight() == user.getHeight() &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getSex(), user.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSex(), getHeight());
    }

    @Override
    public String toString() {
        return "User " +
                "name " + name + '\'' +
                ", age " + age +
                ", sex " + sex + '\'' +
                ", height " + height;
    }

    public int getStag (){  //we create this method in super class, and later override it in daughter class
        return 0;
    }

    public abstract boolean findByParameter (String parameter);




}

