package models.Animal;

public abstract class Animal {

    public static Animal Mammal;
    // attributes
    private String name; // (ex: "Lion")
    private String sex; // (ex: "Female")
    private double weight; // (ex: 130.2)
    private double size; // (ex: 1,6)
    private boolean hungerIndicator; // (false : pas faim ; true : a faim)
    private boolean sleepIndicator; // (false : ne dort pas ; true : dort)
    private boolean healthIndicator; // (false : mal ; true : bien)

    // constructor
    public Animal(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
        this.hungerIndicator = hungerIndicator;
        this.sleepIndicator = sleepIndicator;
        this.healthIndicator = healthIndicator;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public boolean getHungerIndicator() {
        return hungerIndicator;
    }

    public boolean getSleepIndicator() {
        return sleepIndicator;
    }

    public boolean getHealthIndicator() {
        return healthIndicator;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setHungerIndicator(boolean hungerIndicator) {
        this.hungerIndicator = hungerIndicator;
    }

    public void setSleepIndicator(boolean sleepIndicator) {
        this.sleepIndicator = sleepIndicator;
    }

    public void setHealthIndicator(boolean healthIndicator) {
        this.healthIndicator = healthIndicator;
    }

    // methods
    public void eat() {
        if(hungerIndicator == true  && sleepIndicator == false) {
            System.out.println(this.name + " a très faim 🍖");
            System.out.println(this.name + " est en train de manger 🍽");
            this.hungerIndicator = false;
            System.out.println(this.name + " n'a plus faim.");
        }
        else {
            System.out.println(this.name + " n'a pas faim.");
        }
    }

    public void makeSound() {
        System.out.println(this.name + " est en train d'émettre un son 🔊");
    }

    public void beCared() {
        if(healthIndicator == false) {
            System.out.println(this.name + " n'est pas en bonne santé, il va être soigné 🤕💊");
            System.out.println(this.name + " est en train d'être soigné 🏥");
            this.healthIndicator = true;
            System.out.println(this.name + " est de nouveau en bonne santé ! ✨");
        }
    }

    public void sleep() {
        if(sleepIndicator == false) {
            System.out.println(this.name + " ne dort pas, il va s'endormir 🥱");
            System.out.println(this.name + " est en train de dormir 💤");
            this.sleepIndicator = true;
        }
    }

    public void wakeUp() {
        if(sleepIndicator == true) {
            System.out.println(this.name + " vient tout juste de se réveiller ! 🌅");
            this.sleepIndicator = false;
        }
    }

    public void randomizeAnimal() {
        int random = (int) (Math.random() * 10);
        if(random == 0) {
            this.hungerIndicator = true;
        }
        else {
            this.hungerIndicator = false;
        }
        if(random == 1) {
            this.sleepIndicator = true;
        }
        else {
            this.sleepIndicator = false;
        }
        if(random == 2) {
            this.healthIndicator = false;
        }
        else {
            this.healthIndicator = true;
        }
    }
}