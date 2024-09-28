public class Dog {
    private String name;
    private int age;
    private String breed;
    private int feedCount;
    private int learnCount;
    private int showerCount;
    private boolean isSmart;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    //cat sound
    public void bark() {
        System.out.println("Bark, I'm dog " + name + "!");
    }

    //feeding cat
    public void feedDog(String food) {
        System.out.println("You just feed your dog " + food + "!");
        feedCount++;
        System.out.println("You fed your dog " + feedCount + " times!");
    }

    //cat learn
    public void dogLearn() {
        System.out.println(name + " learned a new skill!");
        learnCount++;
        System.out.println(name + " learned " + learnCount + " times!");
    }

    //is the cat smart?
    public boolean isDogSmart() {
        if (learnCount > 3) {
            return true;
        } else {
            return false;
        }
    }

    //pet showering
    public void dogShower() {
        System.out.println(name + " just had a shower!");
        showerCount++;
    }

    //printing cat info
    public void printDogInfo() {
        System.out.println("Dog");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Fed count: " + feedCount);
        System.out.println("Learn count: " + learnCount);
        System.out.println("Shower count: " + showerCount);
        System.out.println("Is smart: " + isDogSmart());
        System.out.println("Is clean: " + isDogClean());
    }

    public boolean isDogClean() {
        if (showerCount > 3) {
            return true;
        } else {
            return false;
        }
    }
}

