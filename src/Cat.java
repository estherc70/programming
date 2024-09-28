public class Cat {
    //instance vars attributes
    private String name;
    private int age;
    private String breed;
    private int feedCount;
    private int showerCount;
    private int learnCount;
    //cat constructor
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age =age;
        this.breed = breed;
    }
    //cat sound
    public void meow() {
        System.out.println("Meow, I'm cat " + name + "!");
    }
    //feeding cat
    public void feedCat(String food) {
        System.out.println("You just feed your cat " + food + "!");
        feedCount++;
        System.out.println("You fed your cat " + feedCount + " times!");
    }
    //cat learn
    public void catLearn() {
        System.out.println(name + " learned a new skill!");
        learnCount++;
        System.out.println(name + " learned " + learnCount + " times!");
    }
    //is the cat smart?
    public boolean isCatSmart() {
        if (learnCount > 3) {
            return true;
        }
        else {
            return false;
        }
    }
    //pet showering
    public void catShower() {
        System.out.println(name + " just had a shower!");
        showerCount++;
    }
    //printing cat info
    public void printCatInfo() {
        System.out.println("Cat");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Fed count: " + feedCount);
        System.out.println("Learn count: " + learnCount);
        System.out.println("Shower count: " + showerCount);
        System.out.println("Is smart: " + isCatSmart());
        System.out.println("Is clean: " + isCatClean());
    }

    public boolean isCatClean() {
        if (showerCount > 3) {
            return true;
        }
        else {
            return false;
        }
    }
}
