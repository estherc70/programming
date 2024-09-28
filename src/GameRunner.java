import java.util.Scanner;
import java.util.Random;

public class GameRunner {
    public static void main(String[] args) {
        //creating scanner and random and timer
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //welcoming user
        System.out.print("Welcome to PET SIMULATOR!");
        System.out.println("---------------------------------------------");
        System.out.print("Do you want a cat or a dog?\nEnter here(cat or dog): ");
        String pet1 = scan.nextLine();
        System.out.print("Enter the name of your " + pet1 + ": ");
        String name1 = scan.nextLine();
        System.out.print("Enter the age of your " + pet1 + ": ");
        int age1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the breed of your " + pet1 + ": ");
        String breed1 = scan.nextLine();
        //creating pet object
        Cat cat1 = new Cat(name1,age1,breed1);
        Dog dog1 = new Dog(name1,age1,breed1);

        //vars
        boolean isRunning = true;
        //loop
        while (isRunning == true) {
            //printing out options for pets
            System.out.println("---------------------------------------------");
            System.out.println("Things to do with your pets!");
            System.out.println("---------------------------------------------");
            System.out.println("1.Pet sounds");
            System.out.println("2.Feed pet");
            System.out.println("3.Pet information");
            System.out.println("4.Pet shower");
            System.out.println("5.Pet learn");
            System.out.print("Enter your option (-1 to stop): ");
            System.out.println();
            System.out.println("In order for your pet to be smart you need to learn more than 3 times!");
            System.out.println("In order for your pet to be clean you need to shower more than 3 times");
            int option = scan.nextInt();
            System.out.println("---------------------------------------------");
            scan.nextLine();
            //testing if condition is true
            //pet sounds
            if (option == 1) {
                if (pet1.equals ("cat" )){
                    cat1.meow();
                }
                else {
                    dog1.bark();
                }
            }
            //feeding pet
            else if ( option == 2) {
                if (pet1.equals ("cat")) {
                    System.out.print("Enter the food you want to feed your cat: ");
                    String food = scan.nextLine();
                    cat1.feedCat(food);
                }
                else {
                    System.out.print("Enter the food you want to feed your dog: ");
                    String food = scan.nextLine();
                    dog1.feedDog(food);
                }
            }
            //printing cat info
            else if (option == 3) {
                if (pet1.equals ("cat")) {
                    cat1.printCatInfo();
                }
                else {
                    dog1.printDogInfo();
                }
            }
            //pet shower
            else if (option == 4) {
                if (pet1.equals ("cat")) {
                    cat1.catShower();
                }
                else {
                    dog1.dogShower();
                }
            }
            //pet learn
            else if (option == 5) {
                if (pet1.equals ("cat")) {
                    cat1.catLearn();
                }
                else {
                    dog1.dogLearn();
                }
            }
            //checks to see if the user wants to end the simulator
            else if (option == -1) {
                System.out.println("Hope you had fun!");
                isRunning = false;
            }

            System.out.flush();

        }
    }
}
