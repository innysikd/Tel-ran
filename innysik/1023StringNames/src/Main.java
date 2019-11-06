import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String[] names = {"Peter", "John", "Katy", "Jessie", "James"};

        helloUser(names);



    }

    public static void helloUser (String[] names) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        userInput = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (userInput.equalsIgnoreCase(names[i])) {
                System.out.println("Hello " + names[i]);
                count++;
            }
        }
        if (count == 0){
                System.out.println("Sorry, we don't know you");
            }
        }

}
