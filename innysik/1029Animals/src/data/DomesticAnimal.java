package data;

public class DomesticAnimal extends Animal {

    public DomesticAnimal(String animalName, int age, String color) {
        super(animalName, age, color);
    }

    private String nickName;
    private String ownerName;

    public DomesticAnimal(String animalName, int age, String color, String nickName, String ownerName) {
        super(animalName, age, color);
        this.nickName = nickName;
        this.ownerName = ownerName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "DomesticAnimal " +
                "nickName " + nickName + '\'' +
                ", ownerName " + ownerName;
    }

    public void play(){
        System.out.println(nickName + " plays");
    }

    @Override // here we override the method, which already exists in the super class
    public void run(){
        System.out.println(nickName + " runs slowly");
    }
}
