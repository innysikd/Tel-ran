package data;

public class WildAnimal extends Animal {

    public WildAnimal(String animalName, int age, String color) {
        super(animalName, age, color);
    }

    private String livingArea;
    private double population;

    public WildAnimal(String animalName, int age, String color, String livingArea, double population) {
        super(animalName, age, color);
        this.livingArea = livingArea;
        this.population = population;
    }

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "WildAnimal " +
                "livingArea " + livingArea + '\'' +
                ", population " + population;
    }

    public void migration (){
        System.out.println(getAnimalName() + " is going south");
    }

    @Override // here we override the method, which already exists in the super class
    public void run(){
        System.out.println(getAnimalName() + " runs fast");
    }
}
